package kr.or.connect.reserverproject.dao;

import java.io.Console;
import java.util.ArrayList;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Component;

import kr.or.connect.reserverproject.config.ApplicationConfig;
import kr.or.connect.reserverproject.dto.File_info;
import kr.or.connect.reserverproject.dto.Product_image;
import kr.or.connect.reserverproject.dto.Promotion;
import static kr.or.connect.reserverproject.dao.ReserverSql.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		//Product_imageDao dao = ac.getBean(Product_imageDao.class);
		//List<Product_image> product_image = new ArrayList<Product_image>();
		//List<Integer> product_li = new ArrayList<Integer>();
		//product_li.add(11);
		//product_li.add(12);
		//product_li.add(18);
		//product_li.add(22);
		//product_image=dao.search_File_id(product_li,"th");
		//System.out.println(product_image.size());

		
		//ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		//File_InfoDao dao =ac.getBean(File_InfoDao.class);
		//List<Integer> file_id = new ArrayList<Integer>();
		//List<String> path = new ArrayList<String>();
		//file_id.add(89);
		//file_id.add(91);
		//file_id.add(105);
		//file_id.add(114);
		//path=dao.path_Get(file_id);
		//System.out.println(path.toString());
		
		//ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		//ProductDao productDao = ac.getBean(ProductDao.class);
		//System.out.println(productDao.product_Count("1"));
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		ProductDao productDao = ac.getBean(ProductDao.class);
		System.out.println(productDao.get_Product(0, 0));
		
	
	}

}
