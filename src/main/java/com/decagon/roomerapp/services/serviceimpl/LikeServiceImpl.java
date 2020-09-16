package com.decagon.roomerapp.services.serviceimpl;

import com.decagon.roomerapp.models.Like;
import com.decagon.roomerapp.repositories.LikeRepository;
import com.decagon.roomerapp.services.LikeService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class LikeServiceImpl implements LikeService {
    LikeRepository likeRepository;

    public LikeServiceImpl(LikeRepository likeRepository) {
        this.likeRepository = likeRepository;
    }

    @Override
    public Like like(Like like) {
        return likeRepository.save(like);
    }

    @Override
    public List<Like> getLikesByUserId(Long userId) {
        List<Like> likes = likeRepository.findAll();
        Collections.reverse(likes);
        return likes;
    }

    @Override
    public boolean dislike(Long id) {
        return false;
    }
}
