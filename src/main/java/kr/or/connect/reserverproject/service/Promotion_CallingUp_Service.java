package kr.or.connect.reserverproject.service;

import java.util.List;

import kr.or.connect.reserverproject.dto.Product_image;
import kr.or.connect.reserverproject.dto.Promotion;

public interface Promotion_CallingUp_Service {
	public List<Promotion> getPromotionId();
	public List<Product_image> getImage_Id (List<Integer> product_id);
	public List<String> getImage_Path (List<Integer> file_id);
	

}
