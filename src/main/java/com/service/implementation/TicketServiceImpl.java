package com.example.demo.service.implementation;

import com.example.demo.model.Ticket;
import com.example.demo.service.TicketService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

    private final List<Ticket> tickets = new ArrayList<>();

    @Override
    public List<Ticket> getAllTickets() {
        return tickets;
    }

    @Override
    public Ticket saveTicket(Ticket ticket) {
        tickets.add(ticket);
        return ticket;
    }
}
