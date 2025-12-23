package com.example.demo.controller;

import com.example.demo.model.DuplicateRule;
import com.example.demo.service.DuplicateRuleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/duplicate-rules")
public class DuplicateRuleController {

    private final DuplicateRuleService duplicateRuleService;

    // Constructor injection
    public DuplicateRuleController(DuplicateRuleService duplicateRuleService) {
        this.duplicateRuleService = duplicateRuleService;
    }

    // Create / save a duplicate rule
    @PostMapping
    public DuplicateRule saveRule(@RequestBody DuplicateRule rule) {
        return duplicateRuleService.saveRule(rule);
    }

    // Get all duplicate rules
    @GetMapping
    public List<DuplicateRule> getAllRules() {
        return duplicateRuleService.getAllRules();
    }
}
