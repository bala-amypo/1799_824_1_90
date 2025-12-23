package com.example.demo.controller;

import com.example.demo.model.Ticket;
import com.example.demo.service.TicketService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    private final TicketService ticketService;

    // Constructor injection
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    // Create a new ticket
    @PostMapping
    public Ticket createTicket(@RequestBody Ticket ticket) {
        return ticketService.createTicket(ticket);
    }

    // Get ticket by ID
    @GetMapping("/{id}")
    public Ticket getTicketById(@PathVariable Long id) {
        return ticketService.getTicketById(id);
    }

    // Get all tickets
    @GetMapping
    public List<Ticket> getAllTickets() {
        return ticketService.getAllTickets();
    }
}
