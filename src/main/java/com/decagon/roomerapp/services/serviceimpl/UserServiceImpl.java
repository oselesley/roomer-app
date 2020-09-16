package com.decagon.roomerapp.services.serviceimpl;

import at.favre.lib.crypto.bcrypt.BCrypt;
import com.decagon.roomerapp.converters.UserDtoToUser;
import com.decagon.roomerapp.converters.UserToUserDto;
import com.decagon.roomerapp.dtos.UserDto;
import com.decagon.roomerapp.models.User;
import com.decagon.roomerapp.repositories.UserRepository;
import com.decagon.roomerapp.services.UserService;
import com.decagon.roomerapp.utils.BcryptHasher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    UserRepository userRepository;
    UserDtoToUser userDtoToUser;
    UserToUserDto userToUserDto;
    BcryptHasher bcryptHasher;

    public UserServiceImpl(UserRepository userRepository,
                           UserDtoToUser userDtoToUser,
                           UserToUserDto userToUserDto,
                           BcryptHasher bcryptHasher) {
        this.userRepository = userRepository;
        this.userDtoToUser = userDtoToUser;
        this.userToUserDto = userToUserDto;
        this.bcryptHasher = bcryptHasher;
    }

    @Override
    public User createUser(UserDto userdto) {
        User user = userDtoToUser.convert(userdto);
        String passwordHash = "";
        try {
            passwordHash = bcryptHasher.hash(user.getPassword());
            user.setPassword(passwordHash);
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        userRepository.save(user);
        return user;
    }

    @Override
    public User editUser(UserDto userDto) {
        User user = userDtoToUser.convert(userDto);
        User foundUser = userRepository.findUserByEmail(user.getEmail()).orElse(null);
        user.setId(foundUser.getId());
        userRepository.save(user);
        return user;
    }

    @Override
    public User getUser(String email) {
        return userRepository.findUserByEmail(email).orElse(null);
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public boolean deleteUser(UserDto user) {
        return false;
    }
}
