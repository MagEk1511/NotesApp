package com.example.notesapp.model.mapper;

import com.example.notesapp.model.entity.User;
import com.example.notesapp.model.request.user.CreateUserRequest;
import com.example.notesapp.model.response.user.UserResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {
    User toUser(CreateUserRequest createUserRequest);
    UserResponse toUserResponse(User user);
}
