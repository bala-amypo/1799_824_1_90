package com.service.implementation;

import com.model.Ticket;
import com.repository.TicketRepository;
import com.repository.DuplicateRuleRepository;
import com.repository.DuplicateDetectionLogRepository;
import com.service.DuplicateDetectionService;
import org.springframework.stereotype.Service;

@Service
public class DuplicateDetectionServiceImpl implements DuplicateDetectionService {

    private final TicketRepository ticketRepository;
    private final DuplicateRuleRepository duplicateRuleRepository;
    private final DuplicateDetectionLogRepository duplicateDetectionLogRepository;

    // Constructor order EXACT
    public DuplicateDetectionServiceImpl(
            TicketRepository ticketRepository,
            DuplicateRuleRepository duplicateRuleRepository,
            DuplicateDetectionLogRepository duplicateDetectionLogRepository) {
        this.ticketRepository = ticketRepository;
        this.duplicateRuleRepository = duplicateRuleRepository;
        this.duplicateDetectionLogRepository = duplicateDetectionLogRepository;
    }

    @Override
    public boolean isDuplicate(Ticket ticket) {
        return ticketRepository
                .findBySubjectContainingIgnoreCaseOrDescriptionContainingIgnoreCase(
                        ticket.getSubject(),
                        ticket.getDescription()
                ).isPresent();
    }
}
