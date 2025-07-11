package com.example.mock_test_practice.model;

public class User {
    private Long id;
    private String name;

    public User (Long id, String name) {
        this.id = id;
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
