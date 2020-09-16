package com.decagon.roomerapp.converters;

import com.decagon.roomerapp.dtos.UserDto;
import com.decagon.roomerapp.models.User;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Null;

@Component
public class UserToUserDto implements Converter<User, UserDto> {
    @Synchronized
    @Override
    public UserDto convert(User source) {
        if (source == null) return null;

        UserDto userDto = new UserDto();
        userDto.setId(source.getId());
        userDto.setFirstName(source.getFirstName());
        userDto.setLastName(source.getLastName());
        userDto.setEmail(source.getEmail());
        userDto.setState(source.getState());
        userDto.setDob(source.getDob());
        userDto.setGender(source.getGender().toString().toLowerCase());

        return userDto;
    }
}
