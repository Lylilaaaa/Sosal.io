package com.example.sosaldemo.controller;

import com.example.sosaldemo.entity.User;
import com.example.sosaldemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/getAll")
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    @PostMapping("/add")
    public void insertUser(@RequestBody User user) {
        userMapper.insertUser(user);
    }
}
