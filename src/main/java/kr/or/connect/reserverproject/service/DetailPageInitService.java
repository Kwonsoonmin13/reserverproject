package kr.or.connect.reserverproject.service;

import java.util.ArrayList;

public interface DetailPageInitService {
	public ArrayList<String> getTopImages(); //poroduct_image -> file_info
	public ArrayList<String> getIcon(); 
	
	public ArrayList<ArrayList<String>> get_Product_Info(); 
	//public String getContent();//product.content
	//public String getEventStr();//product.event
	public ArrayList<Object> get_Reservation_User_Comment();
	//public ArrayList<String> getScores(); //reservation_user_comment.score
	//public ArrayList<String> getComments(); //reservation_user_comment.comment
	//public String getCommentCounts(); //reservation_user_cooment
	//public ArrayList<String> getCommentDates(); //reservation_user_comment.create_date
	//public ArrayList<String> getEmails(); //reservation_user_comment.reservation_email
}
