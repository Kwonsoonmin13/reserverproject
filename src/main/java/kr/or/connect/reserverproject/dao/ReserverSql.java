package kr.or.connect.reserverproject.dao;

public class ReserverSql {
	public static final String SELECT_PROMOTION = "SELECT * FROM promotion";
	public static final String SELECT_FILE_ID = "SELECT * FROM product_image WHERE product_id" ;
	public static final String SELECT_IMG_PATH ="SELECT * FROM file_info WHERE id";
	
	public static final String SELECT_CATEGORY = "SELECT * FROM category";
	
	public static final String SEARCH_CA_ID = "SELECT id FROM category WHERE name = :category";
	public static final String SELECT_PRODUCT_WI_ID = "SELECT * FROM product where category_id=:category_id LIMIT :start , 4";
	public static final String SELECT_PRODUCT_TOTAL = "SELECT * FROM product LIMIT :start , 4";
	public static final String PRODUCT_COUNT_TOTAL ="SELECT COUNT(*) as count from product";
	public static final String PRODUCT_COUNT_WI_ID="SELECT COUNT(*) as count from product where category_id=:category_id";
	
	public static final String CATEGORY_COUNT ="SELECT count(*) as count from category";
	
	public static final String SELECT_DISPLAY_INFO ="SELECT * FROM display_info WHERE product_id in ";

	
}
