package com.example.demo.service.implementation;

import com.example.demo.model.Ticket;
import com.example.demo.repository.*;
import com.example.demo.service.TicketService;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {

    private final TicketRepository ticketRepo;

    public TicketServiceImpl(TicketRepository ticketRepo,
                             UserRepository userRepo,
                             TicketCategoryRepository categoryRepo) {
        this.ticketRepo = ticketRepo;
    }

    public Ticket saveTicket(Ticket ticket) {
        return ticketRepo.save(ticket);
    }
}
