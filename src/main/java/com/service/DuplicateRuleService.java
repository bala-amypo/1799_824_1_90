package com.example.demo.service;

import com.example.demo.model.Ticket;

public interface DuplicateRuleService {
    boolean isDuplicate(Ticket existingTicket, Ticket newTicket);
}
