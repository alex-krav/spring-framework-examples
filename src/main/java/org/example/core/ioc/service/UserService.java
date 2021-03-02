package org.example.core.ioc.service;

import java.util.List;

public class UserService {

    public List<String> getUsernameList() {
        return List.of("Alex", "Vasya", "John");
    }
}
