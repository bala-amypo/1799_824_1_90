package com.example.demo.service.implementation;

import com.example.demo.model.Ticket;
import com.example.demo.repository.DuplicateDetectionLogRepository;
import com.example.demo.repository.DuplicateRuleRepository;
import com.example.demo.repository.TicketRepository;
import com.example.demo.service.DuplicateDetectionService;
import org.springframework.stereotype.Service;

@Service
public class DuplicateDetectionServiceImpl implements DuplicateDetectionService {

    private final TicketRepository ticketRepository;
    private final DuplicateRuleRepository duplicateRuleRepository;
    private final DuplicateDetectionLogRepository duplicateDetectionLogRepository;

    // Constructor order EXACT (AmyPO rule)
    public DuplicateDetectionServiceImpl(
            TicketRepository ticketRepository,
            DuplicateRuleRepository duplicateRuleRepository,
            DuplicateDetectionLogRepository duplicateDetectionLogRepository
    ) {
        this.ticketRepository = ticketRepository;
        this.duplicateRuleRepository = duplicateRuleRepository;
        this.duplicateDetectionLogRepository = duplicateDetectionLogRepository;
    }

    @Override
    public boolean detectDuplicate(Ticket ticket) {
        return ticketRepository
                .findBySubjectContainingIgnoreCaseOrDescriptionContainingIgnoreCase(
                        ticket.getSubject(),
                        ticket.getDescription()
                )
                .isPresent();
    }
}
