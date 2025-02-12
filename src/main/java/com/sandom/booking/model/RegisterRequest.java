package com.sandom.booking.model;

public record RegisterRequest(
        String username,
        String password,
        UserRole role
) {
}
