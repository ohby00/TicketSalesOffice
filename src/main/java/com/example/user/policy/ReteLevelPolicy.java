package com.example.user.policy;

import com.example.user.user.User;
import com.example.user.user.UserLevel;

public class ReteLevelPolicy implements LevelPolicy {

    private int discountTicket = 5;

    @Override
    public int discountTicket(User user, int discount) {
        if(user.getUserLevel() == UserLevel.LEVER1)
            return discount * discountTicket / 100;
        return 0;
    }
}
