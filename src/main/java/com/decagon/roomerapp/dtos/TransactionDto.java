package com.decagon.roomerapp.dtos;

import com.decagon.roomerapp.models.Room;
import com.decagon.roomerapp.models.User;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


@Getter
@Setter
public class TransactionDto {
    private Long id;
    @DateTimeFormat(pattern = "yyyy-MMM-dd")
    private Date date;
    private UserDto user;
    private RoomDto room;
}
