package com.service;

import com.entity.User;

public interface UserService {

    boolean isUserDuplicate(User user);

    User saveUser(User user);
}
