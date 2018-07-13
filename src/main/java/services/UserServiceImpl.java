package com.jordivilagut.dependencyinjector.services;

import com.jordivilagut.dependencyinjector.model.User;

public class UserServiceImpl implements UserService {

    public UserServiceImpl() {
    }

    public User getUser(String id) {
        return new User(id, "user " + id);
    }
}
