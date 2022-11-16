package com.travel.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="reviews")
public class Review {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int reviewId;
	 private String title;
	 private String description;
	 private int points; //out of 5
	 private String date;
	 private String userName;
	 
	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Review(String title, String description, int points, String date, String userName) {
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
	public void setUsername(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", title=" + title + ", description=" + description + ", points="
				+ points + ", date=" + date + ", userName=" + userName + "]";
	}
	
	
	 
	 
	 
	 }
