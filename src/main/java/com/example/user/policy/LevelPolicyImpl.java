package com.example.user.policy;

import com.example.user.user.UserLevel;
import com.example.user.user.User;

public class LevelPolicyImpl implements LevelPolicy{

    private int discountTicket = 500;

    @Override
    public int discountTicket(User user, int discount) {
        if(user.getUserLevel() == UserLevel.LEVER1){
            return discountTicket;
        }
        return 0;
    }
}
