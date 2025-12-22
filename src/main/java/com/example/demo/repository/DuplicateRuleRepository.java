package com.example.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.DuplicateRule;

public interface DuplicateRuleRepository extends JpaRepository<DuplicateRule, Long> {

}
