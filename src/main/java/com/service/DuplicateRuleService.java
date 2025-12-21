package com.example.demo.service;

import com.example.demo.entity.DuplicateRule;

public interface DuplicateRuleService {

    // Check whether duplicate rule already exists
    boolean isDuplicateRuleExists(DuplicateRule duplicateRule);

    // Save duplicate rule if not already present
    DuplicateRule saveDuplicateRule(DuplicateRule duplicateRule);
}
