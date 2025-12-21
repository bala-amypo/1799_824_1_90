package com.example.demo.service;

import com.example.demo.entity.Ticket;

public interface DuplicateDetectionService {

    // Detect duplicate ticket based on configured rules
    boolean detectDuplicate(Ticket ticket);
}
