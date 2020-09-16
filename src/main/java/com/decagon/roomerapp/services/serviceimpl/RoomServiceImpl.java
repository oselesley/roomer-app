package com.decagon.roomerapp.services.serviceimpl;

import com.decagon.roomerapp.converters.RoomDtoToRoom;
import com.decagon.roomerapp.converters.RoomToRoomDto;
import com.decagon.roomerapp.dtos.RoomDto;
import com.decagon.roomerapp.models.Room;
import com.decagon.roomerapp.repositories.RoomRepository;
import com.decagon.roomerapp.services.RoomService;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {
    RoomRepository roomRepository;
    RoomDtoToRoom roomDtoToRoom;
    RoomToRoomDto roomToRoomDto;

    public RoomServiceImpl(RoomRepository roomRepository,
                           RoomDtoToRoom roomDtoToRoom,
                           RoomToRoomDto roomToRoomDto) {
        this.roomRepository = roomRepository;
        this.roomDtoToRoom = roomDtoToRoom;
        this.roomToRoomDto = roomToRoomDto;
    }

    @Override
    public List<Room> getRooms() {
        return null;
    }

    @Override
    public RoomDto getRoomById(Long id) {
        return roomToRoomDto.convert(roomRepository.findById(id).orElse(null));
    }

    @Override
    public RoomDto getRoomByUser(Long userId) {
        return null;
    }

    @Override
    public RoomDto createRoom(RoomDto roomDto) {
        Room room = roomDtoToRoom.convert(roomDto);
        room = roomRepository.save(room);
        if (room == null) return null;
        return roomToRoomDto.convert(room);
    }

    @Override
    public RoomDto updateRoom(RoomDto roomDto) {
        return null;
    }

    @Override
    public boolean deleteRoom(RoomDto roomDto) {
        return false;
    }
}
