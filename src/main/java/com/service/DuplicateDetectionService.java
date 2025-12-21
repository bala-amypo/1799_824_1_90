package com.service;

import com.model.Ticket;

public interface DuplicateDetectionService {
    boolean checkDuplicate(Ticket newTicket);
}
