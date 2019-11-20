package kr.or.connect.reserverproject.dto;

import java.util.ArrayList;

public class DetailInitDTO {
	private ArrayList<String> topImage;
	private ArrayList<String> icon;
	private String title;
	private String summary;
	private String event;
	private ArrayList<String> event_Img;
	private String score_avg;
	private String score_Count;
	private ArrayList<String> comments;
	private ArrayList<String> comments_Img;
	
	
	public ArrayList<String> getEvent_Img() {
		return event_Img;
	}
	public void setEvent_Img(ArrayList<String> event_Img) {
		this.event_Img = event_Img;
	}
	public ArrayList<String> getTopImage() {
		return topImage;
	}
	public void setTopImage(ArrayList<String> topImage) {
		this.topImage = topImage;
	}
	public ArrayList<String> getIcon() {
		return icon;
	}
	public void setIcon(ArrayList<String> icon) {
		this.icon = icon;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public String getScore_avg() {
		return score_avg;
	}
	public void setScore_avg(String score_avg) {
		this.score_avg = score_avg;
	}
	public String getScore_Count() {
		return score_Count;
	}
	public void setScore_Count(String score_Count) {
		this.score_Count = score_Count;
	}
	public ArrayList<String> getComments() {
		return comments;
	}
	public void setComments(ArrayList<String> comments) {
		this.comments = comments;
	}
	public ArrayList<String> getComments_Img() {
		return comments_Img;
	}
	public void setComments_Img(ArrayList<String> comments_Img) {
		this.comments_Img = comments_Img;
	}
	
	
}
