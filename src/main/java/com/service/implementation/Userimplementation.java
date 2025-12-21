package com.service.implementation;

import com.model.User;
import com.repository.UserRepository;
import com.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    // Constructor order MUST match test suite
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean isUserDuplicate(User user) {
        return userRepository.existsByEmail(user.getEmail());
    }

    @Override
    public User saveUser(User user) {
        if (isUserDuplicate(user)) {
            throw new RuntimeException("email already exists");
        }
        return userRepository.save(user);
    }
}
