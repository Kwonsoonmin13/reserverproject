package kr.or.connect.reserverproject.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.or.connect.reserverproject.dto.File_info;
import kr.or.connect.reserverproject.dto.Product_image;
import kr.or.connect.reserverproject.dto.Promotion;
import kr.or.connect.reserverproject.service.Promotion_CallingUp_Service;

@RestController
public class GetPromotion {
	@Autowired
	Promotion_CallingUp_Service promotion_Service;
	
	@RequestMapping(method =RequestMethod.GET, path="/api/promotions")
	public Object promotion(){
		
		List<Promotion> promotion_li = new ArrayList<Promotion>();
		List<Integer> product_id = new ArrayList<Integer>();
		Promotion promotion = new Promotion();
		
		List<Product_image> product_image_objects = new ArrayList<Product_image>();
		Product_image product_image = new Product_image();
		List<Integer> file_id= new ArrayList<Integer>();
		
		List<File_info> file_infos = new ArrayList<File_info>();
		File_info file_info = new File_info();
		List<String> image_path = new ArrayList<String>();
		
		
		promotion_li=promotion_Service.getPromotionId();
		for(int i=0;i<promotion_li.size();i++) {
			promotion=promotion_li.get(i);
			product_id.add(promotion.getProduct_id());
		}
		
		product_image_objects=promotion_Service.getImage_Id(product_id);
		for(int i=0;i<product_image_objects.size();i++) {
			product_image = product_image_objects.get(i);
			file_id.add(product_image.getFile_id());
		}
		
		file_infos=promotion_Service.getImage_Path(file_id);
		for(int j=0;j<file_infos.size();j++) {
		file_info=file_infos.get(j);
		image_path.add(file_info.getSave_file_name());
		}
		
		return image_path;
	}
	
}
