package com.example.demo_pageable.service;

import com.example.demo_pageable.models.User;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UserService {
    User createUser(User user);
    Page<User> getPageUser(int page, int size);
    List<User> getAll();

}
