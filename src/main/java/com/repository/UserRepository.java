package com.example.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    User findByEmail(String email); // optional helper for login
}
