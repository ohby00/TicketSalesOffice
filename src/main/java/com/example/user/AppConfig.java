package com.example.user;

import com.example.user.policy.FixLevelPolicy;
import com.example.user.policy.LevelPolicy;
import com.example.user.policy.ReteLevelPolicy;
import com.example.user.repository.MemoryUserRepository;
import com.example.user.repository.UserRepository;
import com.example.user.service.OrderService;
import com.example.user.service.OrderServiceImpl;
import com.example.user.service.UserService;
import com.example.user.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public UserService userService() {
        return new UserServiceImpl(userRepository());
    }

    @Bean
    public OrderService  orderService() {
        return new OrderServiceImpl(userRepository(), levelPolicy());
    }

    @Bean
    public UserRepository userRepository() {
        return new MemoryUserRepository();
    }

    @Bean
    public LevelPolicy levelPolicy() {
        return new FixLevelPolicy();
    }

}
