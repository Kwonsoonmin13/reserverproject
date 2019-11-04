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

import kr.or.connect.reserverproject.dto.Product_image;
import static kr.or.connect.reserverproject.dao.ReserverSql.*;

@Repository
public class Product_imageDao {
	NamedParameterJdbcTemplate jdbc ;
	RowMapper<Product_image> rowMapper = BeanPropertyRowMapper.newInstance(Product_image.class);
	
	public Product_imageDao(DataSource dataSource) {
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
	}
	
	public List<Product_image> search_File_id(List<Integer> product_li,String type){

		String product_id="(";
		
		for(int i=0;i<product_li.size();i++) {
			
			product_id=product_id+String.valueOf(product_li.get(i));
			if(product_li.size()-1!=i) {
				product_id+=",";
			}
		}
		product_id+=")";
		
		//id_list , type
		String sql = SELECT_FILE_ID+" in "+product_id+" and"+" type=\""+type+"\"";
		
		
		return jdbc.query(sql,rowMapper);
	
	}

}
