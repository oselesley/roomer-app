package com.decagon.roomerapp.repositories;

import com.decagon.roomerapp.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
