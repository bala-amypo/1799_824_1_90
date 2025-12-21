package com.example.demo.service;

import com.example.demo.model.Ticket;

public interface DuplicateDetectionService {

    boolean detectDuplicate(Ticket ticket);
}
