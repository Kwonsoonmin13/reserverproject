package kr.or.connect.reserverproject.api;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import kr.or.connect.reserverproject.config.ApplicationConfig;
import kr.or.connect.reserverproject.service.Product_Service;

@RestController
public class GetProduct {
	ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
	Product_Service product_Service = ac.getBean(Product_Service.class);
	
	@RequestMapping(method = RequestMethod.GET,path = "/api/ProductCount/{category}")
	public String get_Product_Count(@PathVariable(name = "category")int category) {
		String count="";
		count=String.valueOf(product_Service.Get_Prodcut_Count(category));
		
		return count;
	}
	
	@RequestMapping(method = RequestMethod.GET,path = "/api/ProductList/{category}/{start}")
	public List<List<String>> get_Product_List(@PathVariable(name = "category")int category, @PathVariable(name = "start")int start) {
		return product_Service.Get_Product_List(category, start);
	}
}
