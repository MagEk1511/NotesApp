package com.example.notesapp.model.response.user;

public record UserResponse(
        String username,
        String email,
        String firstName,
        String lastName
) {
}
