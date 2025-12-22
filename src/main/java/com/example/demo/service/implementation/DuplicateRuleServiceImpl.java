package com.example.demo.service.implementation;

import com.example.demo.model.DuplicateRule;
import com.example.demo.repository.DuplicateRuleRepository;
import com.example.demo.service.DuplicateRuleService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DuplicateRuleServiceImpl implements DuplicateRuleService {

    private final DuplicateRuleRepository repository;

    public DuplicateRuleServiceImpl(DuplicateRuleRepository repository) {
        this.repository = repository;
    }

    @Override
    public DuplicateRule saveRule(DuplicateRule rule) {
        return repository.save(rule);
    }

    @Override
    public List<DuplicateRule> getAllRules() {
        return repository.findAll();
    }
}
