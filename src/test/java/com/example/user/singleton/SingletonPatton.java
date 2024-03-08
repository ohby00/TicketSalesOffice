package com.example.user.singleton;

public class SingletonPatton {

    private static final SingletonPatton instance = new SingletonPatton();

    public static SingletonPatton getInstance() {
        return instance;
    }

    private SingletonPatton(){
    }
}
