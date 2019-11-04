package kr.or.connect.reserverproject.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.or.connect.reserverproject.dao.File_InfoDao;
import kr.or.connect.reserverproject.dao.Product_imageDao;
import kr.or.connect.reserverproject.dao.PromotionDao;
import kr.or.connect.reserverproject.dto.Product_image;
import kr.or.connect.reserverproject.dto.Promotion;
import kr.or.connect.reserverproject.service.Promotion_CallingUp_Service;

@Service
public class Promotion_CallingUpImplement implements Promotion_CallingUp_Service {

	@Autowired
	PromotionDao promotiondao;
	Promotion promotion = new Promotion();
	
	
	@Autowired
	Product_imageDao product_imagedao;
	List<Integer> file_info = new ArrayList<Integer>();
	
	
	@Autowired
	File_InfoDao file_infodao;
	List<String> path = new ArrayList<String>();
	
	
	
	
	@Override
	@Transactional
	public List<Promotion> getPromotionId() {
		// TODO Auto-generated method stub
		List<Promotion> promotion_li = promotiondao.selectAll();
		ArrayList<Integer> id_li=new ArrayList<Integer>();
				
	
		return promotion_li;
	}

	@Override
	@Transactional
	public List<Product_image> getImage_Id(List<Integer> product_id) {
		// TODO Auto-generated method stub
		List<Product_image> product_image_li = new ArrayList<Product_image>();
		product_image_li=product_imagedao.search_File_id(product_id,"th");
	
		return product_image_li;
	
	}

	@Override
	@Transactional
	public List<String> getImage_Path(List<Integer> file_id) {
		return path=file_infodao.path_Get(file_id);
	}

}
