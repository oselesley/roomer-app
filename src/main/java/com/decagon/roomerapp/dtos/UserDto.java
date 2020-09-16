package com.decagon.roomerapp.dtos;

import com.decagon.roomerapp.models.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class UserDto {
    private Long id;
    @Size(max = 100)
    @NotNull
    private String firstName;
    @Size(max = 100)
    @NotNull
    private String lastName;
    @Email(message = "must be a valid email")
    private String email;
    @NotNull
    private String password;
    private String state;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dob;
    private Long likes = 0L;
    private List<Like> likesList = new ArrayList<>();
    private List<ReviewDto> reviews = new ArrayList<>();
    private List<RoomDto> rooms = new ArrayList<>();
    private List<TransactionDto> transactions = new ArrayList<>();
    private String gender;
}
