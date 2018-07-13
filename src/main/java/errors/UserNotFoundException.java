package com.jordivilagut.dependencyinjector.errors;

public class UserNotFoundException extends RuntimeException {


    private String userId;

    public UserNotFoundException(String userId) {
        super("User with ID " + userId + " not found.");
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }
}
