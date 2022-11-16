package com.travel.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.travel.entity.Review;

@Service
public interface ReviewService {

	public Review insertReview(Review review)throws Exception;
	public List<Review> getAllReviews()throws Exception;
    public List<Review> getReviewBytitle(String title)throws Exception;
   public List<Review> getReviewBydescription( String description)throws Exception;
  public List<Review> getReviewBypoints(int points) throws Exception;
	public List<Review> getReviewByUserName(String userName) throws Exception;
	public Review getReviewByReviewId(int reviewId)throws Exception;
	public void delete(int reviewId) throws Exception;

	
}