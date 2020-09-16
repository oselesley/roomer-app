package com.decagon.roomerapp.repositories;

import com.decagon.roomerapp.models.Like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<Like, Long> {
}
