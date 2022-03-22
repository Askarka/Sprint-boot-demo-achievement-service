package ru.itis.springbootdemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.itis.springbootdemo.dto.UserDto;
import ru.itis.springbootdemo.models.User;
import ru.itis.springbootdemo.repositories.UsersRepository;

import java.util.List;

@Component
public class UserShowServiceImpl implements UserShowService {
    @Autowired
    private UsersRepository usersRepository;

    @Override
    public List<UserDto> getAllUsers() {
        List<User> users = usersRepository.findAll();
        return UserDto.from(users);
    }
}
