package com.example.user.user;

import lombok.Data;

@Data
public class User {

    private Long id;
    private String name;
    private UserLevel userLevel;

    public User(Long id, String name, UserLevel userLevel) {
        this.id = id;
        this.name = name;
        this.userLevel = userLevel;
    }
}
