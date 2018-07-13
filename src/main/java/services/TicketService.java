package services;

import model.Ticket;

import java.util.List;

public interface TicketService {

    List<Ticket> getTickets(String userId);
}
