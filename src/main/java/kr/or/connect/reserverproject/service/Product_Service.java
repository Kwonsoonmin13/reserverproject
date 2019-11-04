package kr.or.connect.reserverproject.service;

import java.util.List;
import kr.or.connect.reserverproject.dto.Product;

public interface Product_Service {
	
	public int Get_Prodcut_Count(int category);
	public List<List<String>> Get_Product_List(int category, int start);
}
