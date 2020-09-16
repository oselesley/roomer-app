package com.decagon.roomerapp.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@Entity
@Table(name = "rooms")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    @OneToMany(mappedBy = "room")
    private List<Review> reviews = new ArrayList<>();
    @OneToMany(mappedBy = "room")
    private List<Like> likes = new ArrayList<>();
    @OneToMany(mappedBy = "room")
    private List<Transaction> transactions = new ArrayList<>();
    private Double price;
    private Long duration;
    private String url;
    private Integer beds;
    private Integer bathroom;
    private Integer kitchen;
    private String state;
    private boolean available;


    private boolean electricity;
    private boolean jacuzzi;
    private boolean twinbeds;
    private boolean readingTable;
    private boolean airConditioning;
    private boolean security;
    private boolean internet;
    private boolean sofas;
    @ManyToOne
    private User user;
    private String location;
    @CreationTimestamp
    private Date createdAt;
    @UpdateTimestamp
    private Date updatedAt;
}
