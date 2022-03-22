package ru.itis.springbootdemo.services;

import ru.itis.springbootdemo.dto.UserDto;

import java.util.List;

public interface UserShowService {
    List<UserDto> getAllUsers();
}
