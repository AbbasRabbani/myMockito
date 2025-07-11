package com.example.mock_test_practice.repository;


import com.example.mock_test_practice.model.User;

import org.springframework.stereotype.Repository;

@Repository

public class UserRepository {
    public User findById(Long id) {
        // Simulating a user fetch from a database
        return new User(id, "Real User");
    }
}