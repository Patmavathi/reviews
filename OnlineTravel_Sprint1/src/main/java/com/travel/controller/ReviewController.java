package com.travel.controller;
import org.springframework.http.HttpStatus;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travel.entity.Review;
import com.travel.service.ReviewService;

@RestController
@RequestMapping("/travel/review")

public class ReviewController {
	
	@Autowired
	ReviewService reviewService;

	public ReviewController() {
		System.out.println("\n\n\n====>> Inside Constructor " + this);
	}
	
	@PostMapping("/addreview")
	public ResponseEntity<String> addReview(@RequestBody Review review) {
		try {
			Review savedUser = reviewService.insertReview(review);
			String responseMsg = savedUser.getUserName() + " save with Id " + savedUser.getReviewId();
			return new ResponseEntity<String>(responseMsg, HttpStatus.OK);
		} catch (Exception e) {
			String errorMsg = "Contact to customer care 1800-250-960 or mail us :- care@capg.com";
			return new ResponseEntity<String>(errorMsg, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/reviewId/{reviewId}")
	public Review getReviewByReviewId(@PathVariable int reviewId) throws Exception
	{
		return reviewService.getReviewByReviewId(reviewId);
	} 
	
	@DeleteMapping("/delete/{deletereviewId}")
	public void deleteReview(@PathVariable int deletereviewId) throws Exception
	{
		try {
			reviewService.delete(deletereviewId);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	@PutMapping("/username/{reviewId}")
    public   Review updateReview(@PathVariable int reviewId, @RequestBody Review reviewDetails) throws Exception {
        reviewService.getReviewByReviewId(reviewId);
        reviewDetails.setReviewId(reviewId);
        Review updateReview = reviewService.insertReview(reviewDetails);
        return updateReview;
    }
	
	@GetMapping("/title/{title}")
	public List<Review> getReviewByTitle(@PathVariable String title) throws Exception
	{
		return reviewService.getReviewBytitle(title);
	}
	
	@GetMapping("/points/{points}")
	public List<Review> getReviewByPoints(@PathVariable int points) throws Exception
	{
		return reviewService.getReviewBypoints(points);
	}
	
	@GetMapping("/allreviews")
	public List<Review> getAllReviews() {
		try {
			List<Review> allExtractedReview = reviewService.getAllReviews();

			return allExtractedReview;

		} catch (Exception e) {
			System.out.println(e);

		}

		return null;
	
	}
	
	
	
	

}
