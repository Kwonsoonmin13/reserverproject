package kr.or.connect.reserverproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller 
public class detailcontrol {
	@RequestMapping(method = RequestMethod.GET, path = "/detailpage/{product_id}")
	public String detailPageget(@PathVariable(name="product_id") String product_id) {
		System.out.print(product_id);
		return "detailpage";
	}
	
}
