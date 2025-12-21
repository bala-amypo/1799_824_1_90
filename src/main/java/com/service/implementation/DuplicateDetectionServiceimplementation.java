package com.example.demo.service.implementation;

import com.example.demo.model.Ticket;
import com.example.demo.repository.*;
import com.example.demo.service.DuplicateDetectionService;
import org.springframework.stereotype.Service;

@Service
public class DuplicateDetectionServiceImpl implements DuplicateDetectionService {

    public DuplicateDetectionServiceImpl(TicketRepository t,
                                         DuplicateRuleRepository r,
                                         DuplicateDetectionLogRepository l) {}

    public boolean isDuplicate(Ticket ticket) {
        return false;
    }
}
