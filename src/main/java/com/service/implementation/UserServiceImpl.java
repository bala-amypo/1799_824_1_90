package com.service.implementation;

import com.model.User;
import com.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getUserById(Long userId) {
        return new User(userId, "Test User");
    }
}
