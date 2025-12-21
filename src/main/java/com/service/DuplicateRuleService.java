package com.example.demo.service;

import com.example.demo.model.DuplicateRule;

public interface DuplicateRuleService {
    DuplicateRule getByRuleName(String name);
}
