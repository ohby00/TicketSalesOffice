package com.example.user;

import com.example.user.service.OrderService;
import com.example.user.service.UserService;
import com.example.user.user.Order;
import com.example.user.user.User;
import com.example.user.user.UserLevel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderApp {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = ac.getBean("userService", UserService.class);
        OrderService orderService = ac.getBean("orderService", OrderService.class);

        Long userId = 1L;
        User user1 = new User(userId, "obw", UserLevel.LEVER1);
        userService.join(user1);

        Order order = orderService.newOrder(userId, "ticket", 10000);
        System.out.println("order = " + order);
        System.out.println(order.transactionTicket());
    }
}
