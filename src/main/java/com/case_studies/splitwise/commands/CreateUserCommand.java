package com.case_studies.splitwise.commands;

import com.case_studies.splitwise.controllers.UserController;
import com.case_studies.splitwise.dtos.CreateUserRequest;
import com.case_studies.splitwise.models.User;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

// Step 2 - Create the concrete command classes
@Component
public class CreateUserCommand implements Command{
    private UserController userController;
    @Override
    public boolean matches(String input) {
        List<String> tokens = Arrays.stream(input.split(" ")).toList();
        String command = tokens.get(0);
        System.out.println(tokens);
        System.out.println(command);
        if(!command.equals(Commands.REGISTER_USER_COMMAND)){
           return false;
        }
        if(tokens.size()<5){
            return false;
        }
        return true;
    }

    @Override
    public void execute(String input) {
        System.out.println("Executing create user command");
        List<String> tokens = Arrays.stream(input.split(" ")).toList();
        System.out.println("tokens : " + tokens);
        CreateUserRequest request = CreateUserRequest.builder()
                .name(tokens.get(1))
                .email(tokens.get(2))
                .password(tokens.get(3))
                .phoneNumber(tokens.get(4))
                .build();


//        // Call a user controller

        User user = userController.createUser(request);
//        System.out.println("created user with id : " + user.getId());
    }
}
