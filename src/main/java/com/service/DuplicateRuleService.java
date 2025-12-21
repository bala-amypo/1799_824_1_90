package service;

import model.Ticket;

public interface DuplicateRuleService {
    boolean isDuplicate(Ticket existingTicket, Ticket newTicket);
}
