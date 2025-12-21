package com.service;

import com.entity.Ticket;

public interface DuplicateDetectionService {

    boolean detectDuplicate(Ticket ticket);
}
