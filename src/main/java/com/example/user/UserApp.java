package com.example.user;

import com.example.user.service.UserService;
import com.example.user.service.UserServiceImpl;
import com.example.user.user.UserLevel;
import com.example.user.user.User;

public class UserApp {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        User user1 = new User(1L, "obw", UserLevel.LEVER1);
        userService.join(user1);


        User findUser = userService.findUser(1L);
        System.out.println(user1);
        System.out.println(user1.getName());


        System.out.println(findUser);
        System.out.println(findUser.getName());

    }
}
