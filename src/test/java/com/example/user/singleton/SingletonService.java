package com.example.user.singleton;

public class SingletonService {

    public static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }
    public SingletonService() {
    }
}
