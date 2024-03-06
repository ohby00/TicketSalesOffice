package com.example.user.service;

import com.example.user.user.Order;

public interface OrderService {
    Order newOrder(Long userId, String ticketName, int ticketPrice);
}
