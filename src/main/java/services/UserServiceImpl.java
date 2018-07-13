package services;

import model.User;

public class UserServiceImpl implements UserService {

    public UserServiceImpl() {}

    public User getUser(String id) {
        return new User(id, "user " + id);
    }
}
