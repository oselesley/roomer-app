package com.decagon.roomerapp.services;

import com.decagon.roomerapp.dtos.ReviewDto;
import com.decagon.roomerapp.dtos.RoomDto;
import com.decagon.roomerapp.models.Room;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoomService {
    List<Room> getRooms();
    RoomDto getRoomById(Long id);
    RoomDto getRoomByUser(Long userId);
    RoomDto createRoom(RoomDto roomDto);
    RoomDto updateRoom(RoomDto roomDto);
    boolean deleteRoom(RoomDto roomDto);

}
