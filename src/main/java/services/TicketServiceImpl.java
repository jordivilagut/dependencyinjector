package com.jordivilagut.dependencyinjector.services;

import com.jordivilagut.dependencyinjector.errors.UserNotFoundException;
import com.jordivilagut.dependencyinjector.model.User;
import com.jordivilagut.dependencyinjector.model.Ticket;

import java.util.Arrays;
import java.util.List;

public class TicketServiceImpl implements TicketService {

    private UserService userService;

    public TicketServiceImpl(UserService userService) {
        this.userService = userService;
    }

    public List<Ticket> getTickets(String userId) {

        final User user = userService.getUser(userId);
        if (user != null) {
            return Arrays.asList(new Ticket());
        } else {
            throw new UserNotFoundException(userId);
        }
    }
}
