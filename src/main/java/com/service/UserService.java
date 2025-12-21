package com.service;

import com.model.User;

public interface UserService {

    boolean isUserDuplicate(User user);

    User saveUser(User user);
}
