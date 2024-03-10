package com.example.user.repository;

import com.example.user.user.User;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class MemoryUserRepository implements UserRepository {

    private static HashMap<Long, User> storage = new HashMap<>();

    @Override
    public void save(User user) {
        storage.put(user.getId(), user);
    }

    @Override
    public User findById(Long userId) {
        return storage.get(userId);
    }
}
