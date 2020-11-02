package com.example.demo_pageable.apis;


import com.example.demo_pageable.models.User;
import com.example.demo_pageable.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/users")
public class UserAPI {

    @Autowired
    private UserService userService;

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("pages/{page}")
    public Page<User> getPageUser(@PathVariable int page) {
       return userService.getPageUser(page, 5);

    }

    @GetMapping()
    public List<User> getAll() {
        return userService.getAll();
    }

}
