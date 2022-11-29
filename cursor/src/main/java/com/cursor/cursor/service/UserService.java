package com.cursor.cursor.service;

import com.cursor.cursor.entity.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);
    void deleteUser(User user);
    User getByUsername(String username);
    List<User> getAllUser();
}
