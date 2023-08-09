package com.case_studies.splitwise.dtos;

import com.case_studies.splitwise.models.User;
import lombok.Builder;

@Builder
public class CreateUserRequest {
    private String name;
    private String email;
    private String password;
    private String phoneNumber;

    public User toUser() {
        return User.builder()
                .name(name)
                .email(email)
                .password(password)
                .phoneNumber(phoneNumber)
                .build();
    }
}
