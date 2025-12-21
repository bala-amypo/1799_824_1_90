package com.service.implementation;

import com.model.Ticket;
import com.service.DuplicateRuleService;
import org.springframework.stereotype.Service;

@Service
public class DuplicateRuleServiceImpl implements DuplicateRuleService {

    @Override
    public boolean isDuplicate(Ticket existing, Ticket incoming) {

        boolean sameTitle =
                existing.getTitle().equalsIgnoreCase(incoming.getTitle());

        boolean sameUser =
                existing.getUserId().equals(incoming.getUserId());

        boolean sameCategory =
                existing.getCategoryId().equals(incoming.getCategoryId());

        return sameTitle && sameUser && sameCategory;
    }
}
