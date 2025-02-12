package com.sandom.booking.location;

public class InvalidAddressException extends RuntimeException{

    public InvalidAddressException() {
        super("Invalid address");
    }
}
