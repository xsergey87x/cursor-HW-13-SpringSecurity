package com.cursor.cursor.web;

import com.cursor.cursor.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users/")
@RequiredArgsConstructor
public class UserRestController {

    private final UserService userService;

}
