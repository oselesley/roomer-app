package com.decagon.roomerapp.converters;

import com.decagon.roomerapp.dtos.UserDto;
import com.decagon.roomerapp.models.Gender;
import com.decagon.roomerapp.models.User;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Null;

@Component
public class UserDtoToUser implements Converter<UserDto, User> {
    @Synchronized
    @Override
    public User convert(UserDto source) {
        if (source == null) return null;

        User user = new User();
        user.setId(source.getId());
        user.setFirstName(source.getFirstName());
        user.setLastName(source.getLastName());
        user.setEmail(source.getEmail());
        user.setPassword(source.getPassword());
        user.setState(source.getState());
        user.setDob(source.getDob());
        user.setGender(Gender.stringToEnum(source.getGender()));

        return user;
    }
}
