package com.example.user.service;

import com.example.user.policy.LevelPolicy;
import com.example.user.policy.LevelPolicyImpl;
import com.example.user.repository.MemoryUserRepository;
import com.example.user.repository.UserRepository;
import com.example.user.user.Order;
import com.example.user.user.User;
import com.example.user.user.UserLevel;

public class OrderServiceImpl implements OrderService{

    private final UserRepository userRepository = new MemoryUserRepository();
    private final LevelPolicy levelPolicy = new LevelPolicyImpl();

    @Override
    public Order newOrder(Long userId, String ticketName, int ticketPrice) {
        User findUser = userRepository.findById(userId);
        int discountTicket = levelPolicy.discountTicket(findUser, ticketPrice);

        return new Order(userId, ticketName, ticketPrice, discountTicket);
    }
}
