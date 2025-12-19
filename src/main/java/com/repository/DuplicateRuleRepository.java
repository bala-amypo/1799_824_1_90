package com.example.demo.model;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.model.DuplicateRule;

public interface DuplicateRuleRepository extends JpaRepository<DuplicateRule, Long> {

}
