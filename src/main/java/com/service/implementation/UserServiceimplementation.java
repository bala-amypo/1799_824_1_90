package com.example.demo.service.implementation;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repo;

    public UserServiceImpl(UserRepository repo) {
        this.repo = repo;
    }

    public boolean isUserDuplicate(User user) {
        return repo.existsByEmail(user.getEmail());
    }

    public User saveUser(User user) {
        return repo.save(user);
    }
}
