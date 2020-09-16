package com.decagon.roomerapp.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "users")
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String email;
    private String password;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dob;
    private String state;
    @OneToMany(mappedBy = "user")
    private List<Like> likes = new ArrayList<>();
    @OneToMany(mappedBy = "user")
    private List<Review> reviews = new ArrayList<>();
    @OneToMany(mappedBy = "user")
    private List<Room> rooms = new ArrayList<>();
    @OneToMany
    private List<Transaction> transactions = new ArrayList<>();
    @Enumerated(value = EnumType.STRING)
    private Gender gender;
}
