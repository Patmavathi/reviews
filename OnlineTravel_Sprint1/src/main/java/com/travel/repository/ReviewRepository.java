package com.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.travel.entity.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer>,IReviewCustomRepository{


}
