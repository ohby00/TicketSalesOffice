package com.example.user.service;
import com.example.user.AppConfig;
import com.example.user.user.Order;
import com.example.user.user.User;
import com.example.user.user.UserLevel;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class OrderServiceTest {

    UserService userService;
    OrderService orderService;

    @BeforeEach
    void beforeEach(){
        AppConfig appConfig = new AppConfig();
        userService = appConfig.userService();
        orderService = appConfig.orderService();
    }

    @Test
    @DisplayName("새로운 주문")
    void creatOrder(){
        Long userA = 1L;
        User user = new User(userA, "obw", UserLevel.LEVER1);
        userService.join(user);

        Order orderA = orderService.newOrder(userA, "ticketA", 10000);
        Assertions.assertThat(orderA.getDiscountPrice()).isEqualTo(1000);
    }
}