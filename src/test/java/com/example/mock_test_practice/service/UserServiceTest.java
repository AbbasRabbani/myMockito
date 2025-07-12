package com.example.mock_test_practice.service;

import static org.junit.jupiter.api.Assertions.*;
import com.example.mock_test_practice.model.User;
import com.example.mock_test_practice.repository.UserRepository;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class  UserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    public UserServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetUserName() {
        Long userId = 1L;
        User fakeUser = new User(userId, "Mocked User");

        when(userRepository.findById(userId)).thenReturn(fakeUser);

        String userName = userService.getUserName(userId);

        assertEquals("Mocked User", userName);
    }

}