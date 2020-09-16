package com.decagon.roomerapp.services;

import com.decagon.roomerapp.dtos.ReviewDto;
import org.springframework.stereotype.Service;

@Service
public interface ReviewService {
    ReviewDto getReviewByPostId(Long postId);
    ReviewDto getReviewByUserId(Long userId);
    ReviewDto deleteReview(Long id);
}
