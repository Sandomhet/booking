package com.sandom.booking.model;

public record ErrorResponse(
        String message,
        String error
) {
}
