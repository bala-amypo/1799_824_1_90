package com.example.demo.service.implementation;

import com.example.demo.model.DuplicateRule;
import com.example.demo.repository.DuplicateRuleRepository;
import com.example.demo.service.DuplicateRuleService;
import org.springframework.stereotype.Service;

@Service
public class DuplicateRuleServiceImpl implements DuplicateRuleService {

    private final DuplicateRuleRepository duplicateRuleRepository;

    // Constructor order EXACT
    public DuplicateRuleServiceImpl(DuplicateRuleRepository duplicateRuleRepository) {
        this.duplicateRuleRepository = duplicateRuleRepository;
    }

    @Override
    public DuplicateRule saveRule(DuplicateRule rule) {
        if (duplicateRuleRepository.findByRuleName(rule.getRuleName()).isPresent()) {
            throw new RuntimeException("rule already exists");
        }
        return duplicateRuleRepository.save(rule);
    }
}
