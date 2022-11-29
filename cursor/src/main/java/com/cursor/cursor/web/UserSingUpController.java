package com.cursor.cursor.web;

import com.cursor.cursor.entity.User;
import com.cursor.cursor.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sign-up")
@RequiredArgsConstructor
public class UserSingUpController {

    private final UserService userService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User signUp(@RequestBody User user) {
        return userService.saveUser(user);
    }

}
