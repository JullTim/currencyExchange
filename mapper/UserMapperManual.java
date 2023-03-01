package com.application.cryptoExchange.mapper;

import com.application.cryptoExchange.dto.UserDto;
import com.application.cryptoExchange.entity.User;

public class UserMapperManual {
    public UserDto toDto(User user) {
        UserDto userDto = new UserDto();
        if (user == null) {
            return null;
        }
        userDto.setId(user.getId());
        userDto.setSecretKey(user.getSecretKey());
        userDto.setUserName(user.getUserName());
        userDto.setEmail(user.getEmail());
        return userDto;
    }

    public User toDao(UserDto userDto) {
        User user = new User();
        user.setId(userDto.getId());
        user.setSecretKey(userDto.getSecretKey());
        user.setUserName(userDto.getUserName());
        user.setEmail(userDto.getEmail());
        return user;
    }
}