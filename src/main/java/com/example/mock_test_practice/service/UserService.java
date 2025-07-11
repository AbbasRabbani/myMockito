package com.example.mock_test_practice.service;

import com.example.mock_test_practice.model.User;
import com.example.mock_test_practice.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
//    public User getUserById(Long id) {
//        return userRepository.findById(id);
//    }
    public String getUserName(Long id){
        User user = userRepository.findById(id);
        if (user != null) {
            return user.getName();
        } else {
            return "User not found";
        }
    }
}
