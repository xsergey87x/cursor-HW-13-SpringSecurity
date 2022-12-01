package com.cursor.cursor.service;

import com.cursor.cursor.entity.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    UserDetails loadUserByUsername(String email) throws UsernameNotFoundException;

    User saveUser(User user);
    void deleteUser(User user);
    User getByUsername(String username);
    List<User> getAllUser();
}
