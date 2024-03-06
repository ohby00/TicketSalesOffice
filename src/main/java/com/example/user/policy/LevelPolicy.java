package com.example.user.policy;

import com.example.user.user.User;

public interface LevelPolicy {
    int discountTicket(User user, int discount);
}
