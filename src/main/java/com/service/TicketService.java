package com.example.demo.service;

import com.example.demo.entity.Ticket;

public interface TicketService {

    // Check whether ticket already exists (duplicate)
    boolean isTicketDuplicate(Ticket ticket);

    // Save ticket details if not duplicate
    Ticket saveTicket(Ticket ticket);
}
