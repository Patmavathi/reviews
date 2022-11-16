package com.travel.service;


import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.entity.Review;
import com.travel.repository.ReviewRepository;

@Service

public class ReviewServiceImpl implements ReviewService{
	@Autowired
	ReviewRepository reviewRepository;
	
	@Override
	public Review insertReview(Review review) throws Exception {
		// TODO Auto-generated method stub
		Review savedUser =  reviewRepository.save(review);  // Note :  save() is already implemented by Spring Data JPA
		if(savedUser != null)
		{
			return savedUser;
		}
		else return null;
		
	}

	
@Override
	public List<Review> getReviewByUserName(String userName) throws Exception {
		// TODO Auto-generated method stub
		List<Review> outputusername = reviewRepository.getReviewByUserName(userName);
		return outputusername;
        }



	@Override
	public List<Review> getReviewBytitle(String title) throws Exception {
		// TODO Auto-generated method stub
		List<Review> outputtitle = reviewRepository.getReviewByTitle(title);
		return outputtitle;
	}

	@Override
	public List<Review> getReviewBydescription(String description) throws Exception {
		// TODO Auto-generated method stub
		List<Review> outputdescription = reviewRepository.getReviewByDescription(description);
		return outputdescription;
		
	}
	
	@Override
	public List<Review> getReviewBypoints(int points) throws Exception {
		// TODO Auto-generated method stub
		List<Review> outputpoints = reviewRepository.getReviewByPoints(points);
		return outputpoints;

    }

	@Override
	public void delete(int reviewId) throws Exception {
		// TODO Auto-generated method stub
		reviewRepository.deleteById(reviewId);
		
		
	}

	@Override
	public Review getReviewByReviewId(int reviewId) throws Exception {
		// TODO Auto-generated method stub
		
		return reviewRepository.getReviewByReviewId(reviewId);
	}


	@Override
	public List<Review> getAllReviews() throws Exception {
		// TODO Auto-generated method stub
		List<Review> allReviews =  reviewRepository.findAll(); // Note : same as save
		return allReviews;
	
		
	}

	

	
}
