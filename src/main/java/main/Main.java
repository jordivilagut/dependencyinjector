package main;

import injector.DependencyManager;
import model.Ticket;
import model.User;
import services.TicketService;
import services.TicketServiceImpl;
import services.UserService;
import services.UserServiceImpl;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        DependencyManager manager = new DependencyManager();
        manager.bind(UserService.class, UserServiceImpl.class);
        manager.bind(TicketService.class, TicketServiceImpl.class);

        UserService userService = manager.getInstance(UserService.class);
        User user = userService.getUser("1");
        System.out.println(user.getName());

        TicketService ticketService = manager.getInstance(TicketService.class);
        List<Ticket> tickets = ticketService.getTickets(user.getId());
        System.out.println(tickets.get(0).getPrice());
    }
}
