package com.sandom.booking.booking;

public class InvalidBookingException extends RuntimeException{

    public InvalidBookingException(String message) {
        super(message);
    }
}
