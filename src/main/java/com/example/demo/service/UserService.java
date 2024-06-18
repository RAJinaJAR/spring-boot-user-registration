package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
    private Map<String, User> userStorage = new HashMap<>();

    public String registerUser(User user) {
        if (userStorage.containsKey(user.getUsername())) {
            return "User already exists";
        }
        userStorage.put(user.getUsername(), user);
        return "User registered successfully";
    }

    public User fetchUser(String username) {
        return userStorage.get(username);
    }
}
