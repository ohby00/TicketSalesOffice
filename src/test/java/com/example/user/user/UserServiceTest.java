package com.example.user.user;

import com.example.user.service.UserService;
import com.example.user.service.UserServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UserServiceTest {

    UserService userService = new UserServiceImpl();

    @Test
    @DisplayName("회원가입")
    void join(){
        // given
        User user = new User(1L, "member1", UserLevel.LEVER1);

        // when
        userService.join(user);
        User findUser = userService.findUser(1L);

        // then
        Assertions.assertThat(user).isEqualTo(findUser);
    }

}