package com.example.demo.service;

import com.example.demo.entity.User;

public interface UserService {

    // Check whether user already exists (duplicate)
    boolean isUserDuplicate(User user);

    // Save user details if not duplicate
    User saveUser(User user);
}
