package com.decagon.roomerapp.services;

import com.decagon.roomerapp.models.Like;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LikeService {
    Like like (Like like);
    List<Like> getLikesByUserId(Long userId);
    boolean dislike(Long id);
}
