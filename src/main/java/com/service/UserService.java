package com.example.demo.service;

import com.example.demo.model.User;

public interface UserService {
    boolean isUserDuplicate(User user);
    User saveUser(User user);
}
