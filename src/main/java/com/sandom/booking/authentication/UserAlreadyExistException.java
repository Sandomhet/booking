package com.sandom.booking.authentication;

public class UserAlreadyExistException extends RuntimeException {

    public UserAlreadyExistException() {
        super("Username already exists");
    }
}
