package com.sandom.booking.model;

public record LoginRequest(
        String username,
        String password
) {
}
