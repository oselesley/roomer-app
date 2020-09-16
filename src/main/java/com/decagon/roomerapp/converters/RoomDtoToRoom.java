package com.decagon.roomerapp.converters;

import com.decagon.roomerapp.dtos.RoomDto;
import com.decagon.roomerapp.models.Room;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class RoomDtoToRoom implements Converter<RoomDto, Room> {
    @Override
    public Room convert(RoomDto source) {
        if (source == null) return null;

        Room room = new Room();
        room.setTitle(source.getTitle());
        room.setPrice(source.getPrice());
        room.setUser(source.getUser());
        room.setDescription(source.getDescription());
        room.setState(source.getState());
        room.setDuration(source.getDuration());
        room.setLocation(source.getLocation());
        room.setBathroom(source.getBathroom());
        room.setBeds(source.getBeds());
        room.setKitchen(source.getKitchen());
        room.setUrl(source.getUrl());
        room.setAirConditioning(source.isAirConditioning());
        room.setElectricity(source.isElectricity());
        room.setInternet(source.isInternet());
        room.setJacuzzi(source.isJacuzzi());
        room.setReadingTable(source.isReadingTable());
        room.setSecurity(source.isSecurity());
        room.setSofas(source.isSofas());
        room.setTwinbeds(source.isTwinbeds());

        return room;
    }
}
