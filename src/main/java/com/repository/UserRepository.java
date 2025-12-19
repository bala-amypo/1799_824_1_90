package com.example.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.model.UserEntity;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email); // optional helper for login
}
