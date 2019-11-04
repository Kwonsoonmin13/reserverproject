package kr.or.connect.reserverproject.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.or.connect.reserverproject.dao.CategoryDao;
import kr.or.connect.reserverproject.dao.Count_GetDao;
import kr.or.connect.reserverproject.dto.Count;
import kr.or.connect.reserverproject.service.Category_Service;

@Service
public class Category_impl implements Category_Service {

	@Autowired
	Count_GetDao count_GetDao;
	
	@Autowired
	CategoryDao categoryDao;
	
	@Override
	@Transactional
	public String total_Count() {
		String total="";
		total=count_GetDao.count_Total();
		return total;
	}
	
	@Override
	public List<String> Category(){
		List<String> categoryList = new ArrayList<String>();
		categoryList=categoryDao.Select_Category();
		return categoryList;
	}
	

}
