package service;

import model.Ticket;

public interface DuplicateDetectionService {
    boolean checkDuplicate(Ticket newTicket);
}
