package com.decagon.roomerapp.dtos;


import com.decagon.roomerapp.models.Room;
import com.decagon.roomerapp.models.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReviewDto {
    private Long id;
    private UserDto user;
    private RoomDto room;
}
