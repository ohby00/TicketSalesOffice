package com.example.user.singleton;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import static org.junit.jupiter.api.Assertions.*;

class StateTest {

    @Test
    void stateSingleton() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(State.class);
        State bean1 = ac.getBean(State.class);
        State bean2 = ac.getBean(State.class);

        int userA = bean1.order("햄버거", 1000);
        int userB = bean2.order("짜장면", 3000);

        System.out.println("주문하신 햄버거 금액은 = " + userA);
    }

    static class TestFoodOrder {
        @Bean
        public State state() {
            return new State();
        }
    }
}