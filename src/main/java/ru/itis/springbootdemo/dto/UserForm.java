package ru.itis.springbootdemo.dto;

import lombok.Data;

@Data
public class UserForm {
    private String email;
    private String password;
    private String name;
    private String nick;
}
