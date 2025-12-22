package com.example.demo.service.implementation;

import com.example.demo.model.*;
import com.example.demo.repository.*;
import com.example.demo.service.DuplicateDetectionService;
import com.example.demo.util.TextSimilarityUtil;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class DuplicateDetectionServiceImpl implements DuplicateDetectionService {

    private final TicketRepository ticketRepository;
    private final DuplicateRuleRepository ruleRepository;
    private final DuplicateDetectionLogRepository logRepository;

    public DuplicateDetectionServiceImpl(
            TicketRepository ticketRepository,
            DuplicateRuleRepository ruleRepository,
            DuplicateDetectionLogRepository logRepository) {
        this.ticketRepository = ticketRepository;
        this.ruleRepository = ruleRepository;
        this.logRepository = logRepository;
    }

    @Override
    public List<DuplicateDetectionLog> detectDuplicates(Ticket newTicket) {

        List<Ticket> tickets = ticketRepository.findAll();
        List<DuplicateRule> rules = ruleRepository.findAll();
        List<DuplicateDetectionLog> logs = new ArrayList<>();

        for (Ticket existing : tickets) {

            if (existing.getId().equals(newTicket.getId())) continue;

            double score = 0;

            for (DuplicateRule rule : rules) {

                if ("EXACT_MATCH".equals(rule.getRuleType()) &&
                        newTicket.getSubject().equalsIgnoreCase(existing.getSubject())) {
                    score += rule.getWeight();
                }

                if ("KEYWORD_MATCH".equals(rule.getRuleType()) &&
                        newTicket.getDescription().contains(existing.getDescription())) {
                    score += rule.getWeight();
                }

                if ("TEXT_SIMILARITY".equals(rule.getRuleType())) {
                    score += TextSimilarityUtil.similarity(
                            newTicket.getDescription(),
                            existing.getDescription()
                    ) * rule.getWeight();
                }
            }

            if (score >= 0.7) {
                DuplicateDetectionLog log = new DuplicateDetectionLog();
                log.setOriginalTicket(newTicket);
                log.setMatchedTicket(existing);
                log.setMatchScore(score);
                log.setDetectedAt(LocalDateTime.now());

                logs.add(logRepository.save(log));
            }
        }
        return logs;
    }
}
