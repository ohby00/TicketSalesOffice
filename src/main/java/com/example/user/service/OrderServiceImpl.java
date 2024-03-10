package com.example.user.service;

import com.example.user.policy.LevelPolicy;
import com.example.user.repository.UserRepository;
import com.example.user.user.Order;
import com.example.user.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService{

    private final UserRepository userRepository;
    private final LevelPolicy levelPolicy;

    @Override
    public Order newOrder(Long userId, String ticketName, int ticketPrice) {
        User findUser = userRepository.findById(userId);
        int discountTicket = levelPolicy.discountTicket(findUser, ticketPrice);

        return new Order(userId, ticketName, ticketPrice, discountTicket);
    }
}


