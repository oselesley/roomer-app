package com.decagon.roomerapp.services.serviceimpl;

import com.decagon.roomerapp.dtos.ReviewDto;
import com.decagon.roomerapp.services.ReviewService;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Override
    public ReviewDto getReviewByPostId(Long postId) {
        return null;
    }

    @Override
    public ReviewDto getReviewByUserId(Long userId) {
        return null;
    }

    @Override
    public ReviewDto deleteReview(Long id) {
        return null;
    }
}
