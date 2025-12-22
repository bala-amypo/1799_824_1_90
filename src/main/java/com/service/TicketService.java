package com.example.demo.service;

import com.example.demo.model.Ticket;
import java.util.List;

public interface TicketService {
    List<Ticket> getAllTickets();
    Ticket saveTicket(Ticket ticket);
}
