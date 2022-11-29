package com.cursor.cursor.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ping")
public class PingRestController {

    @GetMapping
    public String ping() {
        return "PIng";
    }

}
