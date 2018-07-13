package com.jordivilagut.dependencyinjector.main;

import com.jordivilagut.dependencyinjector.injector.DependencyManager;
import com.jordivilagut.dependencyinjector.model.User;
import com.jordivilagut.dependencyinjector.services.TicketService;
import com.jordivilagut.dependencyinjector.services.TicketServiceImpl;
import com.jordivilagut.dependencyinjector.services.UserService;
import com.jordivilagut.dependencyinjector.services.UserServiceImpl;

public class Main {


    public static void main(String[] args) {

        DependencyManager manager = new DependencyManager();
        manager.bind(UserService.class, UserServiceImpl.class);
        manager.bind(TicketService.class, TicketServiceImpl.class);

        UserService userService = (UserService) manager.getInstance(UserService.class);

        User user = userService.getUser("1");

        System.out.println(user.getName());

        //manager.getInstance(TicketService.class);

    }

}
