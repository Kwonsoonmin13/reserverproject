package kr.or.connect.reserverproject.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.ui.ModelMap;

import kr.or.connect.reserverproject.config.ApplicationConfig;

public class ServiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		//ApplicationContext ac =new AnnotationConfigApplicationContext(ApplicationConfig.class);
		//PromotionService promotionService = ac.getBean(PromotionService.class);
		//List<Integer> product_id = new ArrayList<Integer>();
		//product_id=promotionService.getPromotionId();
		//for(int i=0;i<product_id.size();i++) {
		
			//System.out.println(product_id.get(i));
		//}

		
		
		
		
		//ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		//List<Integer> product_id = new ArrayList<Integer>();
		//List<Integer> file_id = new ArrayList<Integer>();
		
		//PromotionService promotionService =ac.getBean(PromotionService.class);
		//product_id=promotionService.getPromotionId();
		
		//Product_ImageService product_ImageService=ac.getBean(Product_ImageService.class);;
		//file_id=product_ImageService.image_Path(product_id);
		
		//for(int i=0;i<file_id.size();i++) {
			//System.out.println(file_id.get(i));
		//}
		
		//ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		//Promotion_CallingUp_Service service = ac.getBean(Promotion_CallingUp_Service.class);
		//List<Integer> promotion_id = new ArrayList<Integer>();
		//List<Integer> image_id = new ArrayList<Integer>();
		//List<String>path_li = new ArrayList<String>();
		
		//promotion_id=service.getPromotionId();
		//image_id=service.getImage_Id(promotion_id);
		//path_li=service.getImage_Path(image_id);
		//System.out.println(path_li);
		
		//category
		//ApplicationContext ac2 =new AnnotationConfigApplicationContext(ApplicationConfig.class);
		//Category_Service category_Service = ac2.getBean(Category_Service.class);
		//String total="";
		//total=category_Service.total_Count();
		//System.out.println(total);
		
		//ApplicationContext ac3 = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		//System.out.println(category_Service.Category());
		
		//product
		//ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		//Product_Service product_Service =ac.getBean(Product_Service.class);
		//System.out.println(product_Service.Get_Prodcut_Count(1));
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Product_Service product_Service =ac.getBean(Product_Service.class);
		System.out.println(product_Service.Get_Product_List(4, 8));
		
		
		
	}

}
