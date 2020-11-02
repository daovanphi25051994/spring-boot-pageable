package com.example.demo_pageable.service.imp;

import com.example.demo_pageable.models.User;
import com.example.demo_pageable.repository.UserRepository;
import com.example.demo_pageable.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Page<User> getPageUser(int page, int size) {
        return userRepository.findAll(PageRequest.of(page, size));
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

}
