package com.service;

import com.model.Ticket;

public interface DuplicateDetectionService {

    boolean isDuplicate(Ticket ticket);
}
