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
import kr.or.connect.reserverproject.dto.Category;

@Service
public class Category_impl implements Category_Service {

	@Autowired
	CategoryDao categoryDao;
	
	
	@Override
	public List<Category> category(){
		List<Category> inputList = new ArrayList<Category>();
		
		inputList=categoryDao.Select_Category();
		
		return inputList;
	}
	

}
