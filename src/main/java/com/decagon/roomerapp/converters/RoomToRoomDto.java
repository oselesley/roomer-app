package com.decagon.roomerapp.converters;


import com.decagon.roomerapp.dtos.RoomDto;
import com.decagon.roomerapp.models.Room;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class RoomToRoomDto implements Converter<Room, RoomDto> {
    @Override
    public RoomDto convert(Room source) {
        if (source == null) return null;

        RoomDto roomdto = new RoomDto();
        roomdto.setId(source.getId());
        roomdto.setTitle(source.getTitle());
        roomdto.setPrice(source.getPrice());
        roomdto.setUser(source.getUser());
        roomdto.setDescription(source.getDescription());
        roomdto.setState(source.getState());
        roomdto.setLocation(source.getLocation());
        roomdto.setBathroom(source.getBathroom());
        roomdto.setBeds(source.getBeds());
        roomdto.setKitchen(source.getKitchen());
        roomdto.setDuration(source.getDuration());
        roomdto.setUrl(source.getUrl());
        roomdto.setAirConditioning(source.isAirConditioning());
        roomdto.setElectricity(source.isElectricity());
        roomdto.setInternet(source.isInternet());
        roomdto.setJacuzzi(source.isJacuzzi());
        roomdto.setReadingTable(source.isReadingTable());
        roomdto.setSecurity(source.isSecurity());
        roomdto.setSofas(source.isSofas());
        roomdto.setTwinbeds(source.isTwinbeds());

        return roomdto;
    }
}
