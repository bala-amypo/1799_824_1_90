package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class DuplicateDetectionLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Ticket originalTicket;

    @ManyToOne
    private Ticket matchedTicket;

    private double matchScore;

    private LocalDateTime detectedAt;

    public DuplicateDetectionLog() {
    }

    public Long getId() {
        return id;
    }

    public Ticket getOriginalTicket() {
        return originalTicket;
    }

    public void setOriginalTicket(Ticket originalTicket) {
        this.originalTicket = originalTicket;
    }

    public Ticket getMatchedTicket() {
        return matchedTicket;
    }

    public void setMatchedTicket(Ticket matchedTicket) {
        this.matchedTicket = matchedTicket;
    }

    public double getMatchScore() {
        return matchScore;
    }

    public void setMatchScore(double matchScore) {
        this.matchScore = matchScore;
    }

    public LocalDateTime getDetectedAt() {
        return detectedAt;
    }

    public void setDetectedAt(LocalDateTime detectedAt) {
        this.detectedAt = detectedAt;
    }
}
