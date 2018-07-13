package com.jordivilagut.dependencyinjector.services;

import com.jordivilagut.dependencyinjector.model.Ticket;

import java.util.List;

public interface TicketService {


    List<Ticket> getTickets(String userId);

}
