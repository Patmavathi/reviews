package com.travel.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.travel.entity.Review;

@Repository

public interface IReviewCustomRepository {

	 public List<Review> getReviewByUserName(String userName) throws Exception;
	 public List<Review> getReviewByTitle(String title) throws Exception;
	 public List<Review> getReviewByDescription(String description) throws Exception;
	 public List<Review> getReviewByPoints(int points) throws Exception;
	 public Review getReviewByReviewId(int searchedreviewId) throws Exception;
	 
}
