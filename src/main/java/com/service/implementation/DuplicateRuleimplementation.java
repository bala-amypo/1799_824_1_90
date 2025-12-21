package com.service.implementation;

import com.model.DuplicateRule;
import com.repository.DuplicateRuleRepository;
import com.service.DuplicateRuleService;
import org.springframework.stereotype.Service;

@Service
public class DuplicateRuleServiceImpl implements DuplicateRuleService {

    private final DuplicateRuleRepository duplicateRuleRepository;

    public DuplicateRuleServiceImpl(DuplicateRuleRepository duplicateRuleRepository) {
        this.duplicateRuleRepository = duplicateRuleRepository;
    }

    @Override
    public DuplicateRule getRuleByName(String name) {
        return duplicateRuleRepository.findByRuleName(name)
                .orElseThrow(() -> new RuntimeException("rule not found"));
    }
}
