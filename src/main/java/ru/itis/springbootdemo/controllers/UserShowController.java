package ru.itis.springbootdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.itis.springbootdemo.services.UserShowService;

@Controller
public class UserShowController {
    @Autowired
    private UserShowService userShowService;

    @GetMapping("/users")
    public String getUsersPage(Model model) {
        model.addAttribute("usersList", userShowService.getAllUsers());
        return "users_page";
    }


}
