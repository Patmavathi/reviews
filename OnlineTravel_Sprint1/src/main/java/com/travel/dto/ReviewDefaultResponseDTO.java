package com.travel.dto;

import org.springframework.stereotype.Component;

@Component
public class ReviewDefaultResponseDTO {
	
	private int reviewId;
	 private String title;
	 private String description;
	 private int points; //out of 5
	 private String date;
	 private String userName;
	public ReviewDefaultResponseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReviewDefaultResponseDTO(String title, String description, int points, String date, String userName) {
		super();
		this.title = title;
		this.description = description;
		this.points = points;
		this.date = date;
		this.userName = userName;
	}
	public int getReviewId() {
		return reviewId;
	}
	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "ReviewDefaultResponseDTO [reviewId=" + reviewId + ", title=" + title + ", description=" + description
				+ ", points=" + points + ", date=" + date + ", userName=" + userName + "]";
	}
	 
	 

}
