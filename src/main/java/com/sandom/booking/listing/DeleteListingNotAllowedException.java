package com.sandom.booking.listing;

public class DeleteListingNotAllowedException extends RuntimeException {

    public DeleteListingNotAllowedException(String message) {
        super(message);
    }
}
