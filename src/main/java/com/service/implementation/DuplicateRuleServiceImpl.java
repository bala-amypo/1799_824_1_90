package com.example.demo.service.implementation;

import com.example.demo.model.Ticket;
import com.example.demo.service.DuplicateRuleService;
import org.springframework.stereotype.Service;

@Service
public class DuplicateRuleServiceImpl implements DuplicateRuleService {

    @Override
    public boolean isDuplicate(Ticket existingTicket, Ticket newTicket) {
        return existingTicket.getTitle()
                .equalsIgnoreCase(newTicket.getTitle());
    }
}
