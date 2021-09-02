package com.example.user;

import org.springframework.stereotype.Service;

public interface UserService {
    User findByUserName(String name);
//    User findByUserId(Long Id);
    void saveUser(User user);
}
