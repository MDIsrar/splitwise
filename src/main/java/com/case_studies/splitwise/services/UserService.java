package com.case_studies.splitwise.services;

import com.case_studies.splitwise.models.User;
import com.case_studies.splitwise.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private UserRepository userRepository;
    public User createUser(User user){
        return userRepository.save(user);
    }
}
