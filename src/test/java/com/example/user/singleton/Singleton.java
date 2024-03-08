package com.example.user.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Singleton {

    @Test
    @DisplayName("싱글톤 패턴 x")
    void single() {
        SingletonService singletonService1 = new SingletonService();
        SingletonService singletonService2 = new SingletonService();

        System.out.println("singletonService1 = " + singletonService1);
        System.out.println("singletonService2 = " + singletonService2);

        Assertions.assertThat(singletonService1).isNotSameAs(singletonService2);
    }

    @Test
    @DisplayName("싱글톤 패턴 적용")
    void singleton() {
        SingletonPatton singletonPatton1 = SingletonPatton.getInstance();
        SingletonPatton singletonPatton2 = SingletonPatton.getInstance();

        System.out.println("singletonPatton1 = " + singletonPatton1);
        System.out.println("singletonPatton2 = " + singletonPatton2);

        Assertions.assertThat(singletonPatton1).isSameAs(singletonPatton2);
    }
}
