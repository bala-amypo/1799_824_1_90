package service.implementation;

import service.UserService;
import model.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getUserById(Long userId) {
        return new User(userId, "Test User");
    }
}
