package com.example.user;

import com.example.user.service.OrderService;
import com.example.user.service.OrderServiceImpl;
import com.example.user.service.UserService;
import com.example.user.service.UserServiceImpl;
import com.example.user.user.Order;
import com.example.user.user.User;
import com.example.user.user.UserLevel;

public class OrderApp {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long userId = 1L;
        User user1 = new User(userId, "obw", UserLevel.LEVER1);
        userService.join(user1);

        Order order = orderService.newOrder(userId, "ticket", 10000);
        System.out.println(order);
        System.out.println(order.transactionTicket());

    }
}
