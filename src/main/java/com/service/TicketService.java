package com.example.demo.service;

import com.example.demo.model.Ticket;

import java.util.List;

public interface TicketService {

    Ticket saveTicket(Ticket ticket);

    List<Ticket> getTicketsByCategory(Long categoryId);

    List<Ticket> getTicketsByUser(Long userId);

    List<Ticket> getTicketsByStatus(String status);
}
