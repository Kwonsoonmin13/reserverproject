package kr.or.connect.reserverproject.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.or.connect.reserverproject.dao.ProductDao;
import kr.or.connect.reserverproject.dto.Product;
import kr.or.connect.reserverproject.service.Product_Service;

@Service
public class Product_impl implements Product_Service {


	@Autowired
	ProductDao productDao;
	
	@Override
	@Transactional
	public int Get_Prodcut_Count(int category) {
		// TODO Auto-generated method stub
		return productDao.product_Count(category);
	}
	
	@Override
	@Transactional
	public List<List<String>> Get_Product_List(int category,int start) {
		// TODO Auto-generated method stub
		return productDao.get_Product(category, start);
	}
	
	
}
