package services;

import errors.UserNotFoundException;
import model.Ticket;
import model.User;

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
            return Arrays.asList(new Ticket("1", 21.35));
        } else {
            throw new UserNotFoundException(userId);
        }
    }
}
