package com.service.implementation;

import com.model.Ticket;
import com.service.DuplicateDetectionService;
import com.service.DuplicateRuleService;
import com.service.TicketService;
import org.springframework.stereotype.Service;

import java.util.List;

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

        List<Ticket> existingTickets = ticketService.getAllOpenTickets();

        for (Ticket ticket : existingTickets) {
            if (duplicateRuleService.isDuplicate(ticket, newTicket)) {
                return true;
            }
        }
        return false;
    }
}
