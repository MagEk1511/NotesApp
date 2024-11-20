package com.example.notesapp.service.userService;

import com.example.notesapp.model.entity.User;
import com.example.notesapp.model.request.user.CreateUserRequest;
import com.example.notesapp.model.response.user.UserResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    UserResponse findUserByUsername(String username);

    UserResponse createUser(CreateUserRequest createUserRequest);

    List<User> findAllUsers();
}
