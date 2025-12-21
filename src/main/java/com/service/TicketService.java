package com.service;

import com.model.Ticket;
import java.util.List;

public interface TicketService {
    List<Ticket> getAllOpenTickets();
    void saveTicket(Ticket ticket);
}
