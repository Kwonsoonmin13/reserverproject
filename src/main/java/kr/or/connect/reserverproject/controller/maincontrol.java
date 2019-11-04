package kr.or.connect.reserverproject.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.or.connect.reserverproject.service.Promotion_CallingUp_Service;

@Controller
public class maincontrol {
	
	@Autowired
	Promotion_CallingUp_Service promotionService;
	
	
@GetMapping(path="/mainpage")
public String getmainpage(ModelMap map) {
	return "mainpage";
}

}
