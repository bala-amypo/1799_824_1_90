package service.implementation;

import service.TicketService;
import model.Ticket;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

    private final List<Ticket> ticketStore = new ArrayList<>();

    @Override
    public List<Ticket> getAllOpenTickets() {
        return ticketStore;
    }

    @Override
    public void saveTicket(Ticket ticket) {
        ticketStore.add(ticket);
    }
}
