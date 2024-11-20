package com.example.notesapp.model.request.user;

public record CreateUserRequest(
        String username,
        String email,
        String firstName,
        String lastName
) {
}