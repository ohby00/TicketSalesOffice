package com.example.user.service;

import com.example.user.user.User;

public interface UserService {

    void join(User user);

    User findUser(Long userId);
}
