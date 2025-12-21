package com.service;

import com.model.Ticket;

public interface DuplicateRuleService {
    boolean isDuplicate(Ticket existingTicket, Ticket newTicket);
}
