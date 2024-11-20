package com.example.notesapp.controller;

import com.example.notesapp.model.entity.User;
import com.example.notesapp.model.request.user.CreateUserRequest;
import com.example.notesapp.model.response.user.UserResponse;
import com.example.notesapp.service.userService.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/")
public class UserController {

    private final UserService userService;

    @GetMapping("user")
    private List<User> getAllUsers() {
        return userService.findAllUsers();
    }

    @PostMapping("user")
    private UserResponse createUser(@RequestBody CreateUserRequest createUserRequest) {
        return userService.createUser(createUserRequest);
    }
}
