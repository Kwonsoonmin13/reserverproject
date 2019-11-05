package kr.or.connect.reserverproject.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import kr.or.connect.reserverproject.config.ApplicationConfig;
import kr.or.connect.reserverproject.dto.Category;
import kr.or.connect.reserverproject.service.Category_Service;

@RestController
public class GetCategory {
	ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
	Category_Service category_Service = ac.getBean(Category_Service.class);
	
	@RequestMapping(method = RequestMethod.GET ,path = "/api/category")
	public Object GetCategory() {
		List<Category> inputList = new ArrayList<Category>();
		List<String> categoryList=new ArrayList<String>();
		inputList=category_Service.category();
		for(int i=0;i<inputList.size();i++) {
		categoryList.add(inputList.get(i).getName());
		}
		
		return categoryList;
	}

}
