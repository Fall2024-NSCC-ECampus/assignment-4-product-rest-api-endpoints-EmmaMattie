package com.example.restapiendpoints.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restapiendpoints.Entities.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer> {

}
