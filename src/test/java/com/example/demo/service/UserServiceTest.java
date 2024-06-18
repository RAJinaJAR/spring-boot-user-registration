package com.example.demo.service;

import com.example.demo.model.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    @Test
    void registerUser() {
        UserService userService = new UserService();
        User user = new User("testuser", "test@example.com", "password");

        String response = userService.registerUser(user);
        assertEquals("User registered successfully", response);

        response = userService.registerUser(user);
        assertEquals("User already exists", response);
    }

    @Test
    void fetchUser() {
        UserService userService = new UserService();
        User user = new User("testuser", "test@example.com", "password");
        userService.registerUser(user);

        User fetchedUser = userService.fetchUser("testuser");
        assertNotNull(fetchedUser);
        assertEquals("testuser", fetchedUser.getUsername());
        assertEquals("test@example.com", fetchedUser.getEmail());
    }
}
