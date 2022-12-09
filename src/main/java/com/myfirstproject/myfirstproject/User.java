package com.myfirstproject.myfirstproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class User {

    @GetMapping
    public String test() {
        return "hello suraj";
    }
}
