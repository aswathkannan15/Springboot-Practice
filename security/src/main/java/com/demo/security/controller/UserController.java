package com.demo.security.controller;

import com.demo.security.model.User;
import com.demo.security.service.UerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UerService userService;


    @PostMapping("/register")
    public User register(@RequestBody User user) {
            return userService.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        return  userService.verify(user);
    }
}
