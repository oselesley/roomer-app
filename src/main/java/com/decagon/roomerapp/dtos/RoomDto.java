package com.decagon.roomerapp.dtos;

import com.decagon.roomerapp.models.Like;
import com.decagon.roomerapp.models.Review;
import com.decagon.roomerapp.models.User;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class RoomDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private Double price;
    private Long duration;
    private List<ReviewDto> reviews = new ArrayList<>();
    private Long likes = 0L;
    private List<Like> likesList = new ArrayList<>();
    private User user;
    private String url;
    private String state;
    private String location;
    private Integer beds;
    private Integer bathroom;
    private Integer kitchen;

    // Extras
    private boolean electricity;
    private boolean jacuzzi;
    private boolean twinbeds;
    private boolean readingTable;
    private boolean airConditioning;
    private boolean security;
    private boolean internet;
    private boolean sofas;
    @CreationTimestamp
    private Date createdAt;
    @UpdateTimestamp
    private Date updatedAt;
}
