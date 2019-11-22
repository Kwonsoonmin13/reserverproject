package kr.or.connect.reserverproject.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;


import kr.or.connect.reserverproject.dto.Category_id;
import kr.or.connect.reserverproject.dto.Count;
import kr.or.connect.reserverproject.dto.Display_info;
import kr.or.connect.reserverproject.dto.File_info;
import kr.or.connect.reserverproject.dto.Product;
import kr.or.connect.reserverproject.dto.Product_image;

import static kr.or.connect.reserverproject.dao.ReserverSql.*;

@Repository
public class ProductDao {
	NamedParameterJdbcTemplate jdbc;
	//RowMapper<Product> rowMapper = BeanPropertyRowMapper.newInstance(Product.class);
	
	public ProductDao(DataSource dataSource) {
		// TODO Auto-generated constructor stub
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
	}
	
	public int get_Category_DbId(int category){
		RowMapper<Category_id> rowMapperCa_Id = BeanPropertyRowMapper.newInstance(Category_id.class);
		List<Category_id> category_DbId = new ArrayList<Category_id>();
		Map<String,String> params = new HashMap<String,String>();
		String in_cate="";
		switch (category) {			
		case 1:
			in_cate="뮤지컬";
			break;
		case 2:
			in_cate="콘서트";
			break;
		case 3:
			in_cate="클래식";
			break;
		case 4:
			in_cate="연극";
			break;
		case 5:
			in_cate="전시";

		default:
			break;
		}
		params.put("category",in_cate);
		category_DbId=jdbc.query(SEARCH_CA_ID,params,rowMapperCa_Id);
		
		return category_DbId.get(0).getId();
	}
	public void get_Product(int category,int start){
		
	}

	
	
	//public List<List<String>> get_Product(int category,int start) {
	
		//카테고리인지 아닌지 분류
		//시작이 어디서 부터인지
		//카테고리 db검색을 마치고 컨트롤러 영역까지 끌고온다. -> 임플리먼트 영역까지 끌어올림 마침
		//프로덕트를 검색하고 컨트롤러 영역까지 끌고온다. 
		//컨트롤러에서 데이터를 정제한다. 이후 보낸다.
		/*
		List<List<String>> productList=new ArrayList<List<String>>();
		List<Integer>product_Id = new ArrayList<Integer>();
		List<Integer>id_for_image = new ArrayList<Integer>();
		List<String> product0 = new ArrayList<String>();
		List<String> product1 = new ArrayList<String>();
		List<String> product2 = new ArrayList<String>();
		List<String> product3 = new ArrayList<String>();
		
		productList.add(product0);
		productList.add(product1);
		productList.add(product2);
		productList.add(product3);
		
		int db_category_id =0;
		if(category!=0) {
			db_category_id=get_Category_DbId(category);
			product_Select_Cate(productList, start, db_category_id, product_Id);
			
			id_for_image=select_product_image(product_Id);
			select_Product_FileInfo(productList,id_for_image);
			
			select_Display_info(productList,product_Id);
			}
		else {
			product_Select_Total(productList, start, product_Id);
			
			id_for_image=select_product_image(product_Id);
			select_Product_FileInfo(productList,id_for_image);
			
			select_Display_info(productList,product_Id);
			}
		
		for(int i=0;i<productList.size();i++) {
			if(productList.get(i).isEmpty()) {
				productList.remove(i--);
			}
		}
		return productList;
	}
	
	public int product_Count(int category) {
		RowMapper<Count> rowMapperCount = BeanPropertyRowMapper.newInstance(Count.class);
		Map<String,Integer> params = new HashMap<String, Integer>();			
		List<Count> count_in = new ArrayList<Count>();
		
		//category 0 => 전 카테고리 품목을 가져오는 것
		if(category!=0) {
			int db_category_id=0;
			db_category_id=get_Category_DbId(category);
			
			
			params.put("category_id", db_category_id);
			count_in=jdbc.query(PRODUCT_COUNT_WI_ID,params, rowMapperCount);
		}
		else {
			count_in=jdbc.query(PRODUCT_COUNT_TOTAL, rowMapperCount);
		}
		
		
	
		return count_in.get(0).getCount();
	}
	
	
	
	
	
	
		
	
	
	
	
	
	
	
	
	
	private void  product_Select_Total(List<List<String>> productList,int start,List<Integer> id_For_Image) {
		RowMapper<Product> rowMapper = BeanPropertyRowMapper.newInstance(Product.class);
		List<Product> db_product = new ArrayList<Product>();
		Map<String, Integer>param = new HashMap<String, Integer>();
		param.put("start", start);
		db_product=jdbc.query(SELECT_PRODUCT_TOTAL,param, rowMapper);
		for(int i=0;i<db_product.size();i++) {
			productList.get(i).add(String.valueOf(db_product.get(i).getId()));
			productList.get(i).add(db_product.get(i).getDescription());
			productList.get(i).add(db_product.get(i).getContent());
			id_For_Image.add(db_product.get(i).getId());
		}
	}
	private void  product_Select_Cate(List<List<String>> productList,int start,int categry_id,List<Integer> id_For_Image) {
		RowMapper<Product> rowMapper = BeanPropertyRowMapper.newInstance(Product.class);
		List<Product> db_product = new ArrayList<Product>();
		Map<String, Object>param =new HashMap<String, Object>();		
		param.put("category_id", categry_id);
		param.put("start", start);
		db_product=jdbc.query(SELECT_PRODUCT_WI_ID,param,rowMapper);
		for(int i=0;i<db_product.size();i++) {
			productList.get(i).add(String.valueOf(db_product.get(i).getId()));
			productList.get(i).add(db_product.get(i).getDescription());
			productList.get(i).add(db_product.get(i).getContent());
			id_For_Image.add(db_product.get(i).getId());
		}
		
	}
	
	
	private List<Integer> select_product_image(List<Integer> id_For_Image){
		List<Integer> new_id = new ArrayList<Integer>();
		List<Product_image> input = new ArrayList<Product_image>();
		RowMapper<Product_image> rowMapper = BeanPropertyRowMapper.newInstance(Product_image.class);
		String sql =SELECT_PRODUCT_IMAGE+" in(";
		for(int i = 0;i<id_For_Image.size();i++) {
			sql+=id_For_Image.get(i);
			if(id_For_Image.size()-1!=i) {
				sql+=",";
			}
		}
		sql+=") and type=\"th\"";
		input=jdbc.query(sql, rowMapper);
		for(int i=0;i<input.size();i++) {
			new_id.add(input.get(i).getFile_id());
		}
		return new_id;
	}
	private void select_Product_FileInfo(List<List<String>>productList, List<Integer> id_For_Image) {
		RowMapper<File_info> rowMapper = BeanPropertyRowMapper.newInstance(File_info.class);
		List<File_info> input = new ArrayList<File_info>();
		String sql=SELECT_FILE_INFO+" in(";
		for(int i = 0;i<id_For_Image.size();i++) {
			sql+=id_For_Image.get(i);
			if(id_For_Image.size()-1!=i) {
				sql+=",";
			}
		}
		sql+=")";
		input=jdbc.query(sql, rowMapper);
		for(int i=0;i<input.size();i++) {
			productList.get(i).add(input.get(i).getSave_file_name());
		}
	}
	
	private void select_Display_info(List<List<String>> productList, List<Integer> product_Id) {
		RowMapper<Display_info> rowMapper = BeanPropertyRowMapper.newInstance(Display_info.class);
		List<Display_info> input = new ArrayList<Display_info>();
		String sql = SELECT_DISPLAY_INFO+" (";
		for(int i=0;i<product_Id.size();i++) {
			sql+=product_Id.get(i);
			if(product_Id.size()-1!=i) {
				sql+=",";
			}
		}
		sql+=")";
		input=jdbc.query(sql, rowMapper);
		
		List<Integer>same_product_id = new ArrayList<Integer>();
		for(int i=0;i<input.size()-1;i++) {
			for(int j=i+1;j<input.size();j++) {
				if(input.get(i).getProduct_id()==input.get(j).getProduct_id()) {
					input.remove(j--);
				}
				
			}
		}
		
		
		for(int i=0;i<input.size();i++) {
			productList.get(i).add(input.get(i).getPlace_name());
		}*/
	}
	
	

}
