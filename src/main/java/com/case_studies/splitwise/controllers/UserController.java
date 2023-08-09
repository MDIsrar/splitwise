package com.case_studies.splitwise.controllers;

import com.case_studies.splitwise.dtos.CreateUserRequest;
import com.case_studies.splitwise.models.User;
import com.case_studies.splitwise.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class UserController {
    private UserService userService;
    public User createUser(CreateUserRequest request){
        return userService.createUser(request.toUser());
    }
}
