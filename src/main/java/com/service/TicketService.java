package com.service;

import com.entity.Ticket;

public interface TicketService {

    boolean isTicketDuplicate(Ticket ticket);

    Ticket saveTicket(Ticket ticket);
}
