package com.decagon.roomerapp.services;

import com.decagon.roomerapp.dtos.UserDto;
import com.decagon.roomerapp.models.User;
import com.decagon.roomerapp.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User createUser(UserDto user);

    User editUser (UserDto user);

    User getUser (String email);

    List<User> getAllUsers ();

    boolean deleteUser(UserDto user);
}
