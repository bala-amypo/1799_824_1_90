package com.example.demo.service.implementation;

import com.example.demo.model.DuplicateDetectionLog;
import com.example.demo.model.DuplicateRule;
import com.example.demo.model.Ticket;
import com.example.demo.repository.DuplicateDetectionLogRepository;
import com.example.demo.repository.DuplicateRuleRepository;
import com.example.demo.repository.TicketRepository;
import com.example.demo.service.DuplicateDetectionService;
import com.example.demo.util.TextSimilarityUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class DuplicateDetectionServiceImpl implements DuplicateDetectionService {

    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    private DuplicateRuleRepository duplicateRuleRepository;

    @Autowired
    private DuplicateDetectionLogRepository detectionLogRepository;

    @Override
    public List<DuplicateDetectionLog> detectDuplicates(Ticket newTicket) {

        List<Ticket> existingTickets = ticketRepository.findAll();
        List<DuplicateRule> rules = duplicateRuleRepository.findAll();

        List<DuplicateDetectionLog> logs = new ArrayList<>();

        for (Ticket oldTicket : existingTickets) {

            if (oldTicket.getId().equals(newTicket.getId())) {
                continue;
            }

            double score = calculateMatchScore(newTicket, oldTicket, rules);

            if (score >= getThreshold(rules)) {
                DuplicateDetectionLog log = new DuplicateDetectionLog();
                log.setOriginalTicket(newTicket);
                log.setMatchedTicket(oldTicket);
                log.setMatchScore(score);
                log.setDetectedAt(LocalDateTime.now());

                logs.add(detectionLogRepository.s
