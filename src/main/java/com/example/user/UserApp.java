package com.example.user;

import com.example.user.service.UserService;
import com.example.user.service.UserServiceImpl;
import com.example.user.user.UserLevel;
import com.example.user.user.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserApp {

    public static void main(String[] args) {

        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = ac.getBean("userService", UserService.class);

        User user1 = new User(1L, "obw", UserLevel.LEVER1);
        userService.join(user1);

        User findUser = userService.findUser(1L);
        System.out.println("findUser = " + findUser.getName());
        System.out.println("user1 = " + user1.getName());
    }
}
