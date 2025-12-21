package com.example.demo.service.implementation;

import com.example.demo.model.Ticket;
import com.example.demo.repository.TicketRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.TicketCategoryRepository;
import com.example.demo.service.TicketService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

    private final TicketRepository ticketRepository;
    private final UserRepository userRepository;
    private final TicketCategoryRepository ticketCategoryRepository;

    // Constructor order EXACT (AmyPO rule)
    public TicketServiceImpl(
            TicketRepository ticketRepository,
            UserRepository userRepository,
            TicketCategoryRepository ticketCategoryRepository
    ) {
        this.ticketRepository = ticketRepository;
        this.userRepository = userRepository;
        this.ticketCategoryRepository = ticketCategoryRepository;
    }

    @Override
    public Ticket saveTicket(Ticket ticket) {
        if (ticket.getDescription() == null || ticket.getDescription().isEmpty()) {
            throw new RuntimeException("description is required");
        }
        return ticketRepository.save(ticket);
    }

    @Override
    public List<Ticket> getTicketsByCategory(Long categoryId) {
        return ticketRepository.findByCategory_Id(categoryId);
    }

    @Override
    public List<Ticket> getTicketsByUser(Long userId) {
        return ticketRepository.findByUser_Id(userId);
    }

    @Override
    public List<Ticket> getTicketsByStatus(String status) {
        return ticketRepository.findByStatus(status);
    }
}
