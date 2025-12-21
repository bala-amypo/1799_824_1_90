package com.example.demo.service.implementation;

import com.example.demo.model.DuplicateRule;
import com.example.demo.repository.DuplicateRuleRepository;
import com.example.demo.service.DuplicateRuleService;
import org.springframework.stereotype.Service;

@Service
public class DuplicateRuleServiceImpl implements DuplicateRuleService {

    private final DuplicateRuleRepository repo;

    public DuplicateRuleServiceImpl(DuplicateRuleRepository repo) {
        this.repo = repo;
    }

    public DuplicateRule getByRuleName(String name) {
        return repo.findByRuleName(name);
    }
}
