package kr.or.connect.reserverproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class detailcontrol {
	@RequestMapping(method = RequestMethod.GET, path = "./detailpage/{product_id}")
	public String detailPageget() {
		return "detailpage";
	}
	
}
