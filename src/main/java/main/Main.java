package main;

import injector.DependencyManager;
import model.User;
import services.TicketService;
import services.TicketServiceImpl;
import services.UserService;
import services.UserServiceImpl;

public class Main {

    public static void main(String[] args) {

        DependencyManager manager = new DependencyManager();
        manager.bind(UserService.class, UserServiceImpl.class);
        manager.bind(TicketService.class, TicketServiceImpl.class);

        UserService userService = manager.getInstance(UserService.class);

        User user = userService.getUser("1");

        System.out.println(user.getName());

        //manager.getInstance(TicketService.class);
    }
}
