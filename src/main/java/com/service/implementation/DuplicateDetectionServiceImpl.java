package com.example.demo.service.implementation;

import com.example.demo.model.Ticket;
import com.example.demo.service.DuplicateDetectionService;
import com.example.demo.service.DuplicateRuleService;
import com.example.demo.service.TicketService;
import org.springframework.stereotype.Service;

@Service
public class DuplicateDetectionServiceImpl implements DuplicateDetectionService {

    private final TicketService ticketService;
    private final DuplicateRuleService duplicateRuleService;

    public DuplicateDetectionServiceImpl(
            TicketService ticketService,
            DuplicateRuleService duplicateRuleService) {
        this.ticketService = ticketService;
        this.duplicateRuleService = duplicateRuleService;
    }

    @Override
    public boolean checkDuplicate(Ticket newTicket) {
        return ticketService.getAllTickets().stream()
                .anyMatch(t -> duplicateRuleService.isDuplicate(t, newTicket));
    }
}
