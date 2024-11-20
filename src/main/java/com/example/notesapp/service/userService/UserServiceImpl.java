package com.example.notesapp.service.userService;

import com.example.notesapp.model.entity.User;
import com.example.notesapp.model.mapper.UserMapper;
import com.example.notesapp.model.repository.UserRepository;
import com.example.notesapp.model.request.user.CreateUserRequest;
import com.example.notesapp.model.response.user.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public UserResponse findUserByUsername(String username) {
        return userMapper.toUserResponse(
                userRepository.findByUsername(username)
        );
    }

    @Override
    public UserResponse createUser(CreateUserRequest createUserRequest) {
        return userMapper.toUserResponse(
                userRepository.save(
                    userMapper.toUser(createUserRequest)
                )
        );
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }
}
