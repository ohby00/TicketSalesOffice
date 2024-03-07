package com.example.user.policy;

import com.example.user.user.User;
import com.example.user.user.UserLevel;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ReteLevelPolicyTest {

    ReteLevelPolicy reteLevelPolicy = new ReteLevelPolicy();

    @Test
    @DisplayName("level1은 5%할인을 해준다")
    void level1() {
        // given
        User user = new User(1L, "obw", UserLevel.LEVER1);

        // when
        int discount = reteLevelPolicy.discountTicket(user, 10000);

        // then
        assertThat(discount).isEqualTo(500);
    }


}