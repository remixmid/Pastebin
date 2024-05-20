package com.example.Pastebin.controllers;

import com.example.Pastebin.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    private final UsersService usersService;

    @Autowired
    public UserController(UsersService usersService) {
        this.usersService = usersService;
    }
}
