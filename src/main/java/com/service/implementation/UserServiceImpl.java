package com.example.demo.service.implementation;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getUserById(Long id) {
        return new User(id, "Demo User");
    }
}
