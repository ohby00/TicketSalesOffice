package com.example.user.repository;

import com.example.user.user.User;

public interface UserRepository {

    void save(User user);

    User findById(Long userId);

}
