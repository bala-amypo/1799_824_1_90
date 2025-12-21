package com.example.demo.service.implementation;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    // Constructor order EXACT (AmyPO rule)
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
