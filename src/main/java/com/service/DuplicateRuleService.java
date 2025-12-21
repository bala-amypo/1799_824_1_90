package com.service;

import com.entity.DuplicateRule;

public interface DuplicateRuleService {

    boolean isDuplicateRuleExists(DuplicateRule duplicateRule);

    DuplicateRule saveDuplicateRule(DuplicateRule duplicateRule);
}
