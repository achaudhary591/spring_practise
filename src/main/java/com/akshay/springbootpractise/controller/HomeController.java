package com.akshay.springbootpractise.controller;

import com.akshay.springbootpractise.models.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "Hello world!";
    }

    @RequestMapping("/user")
    public User userObject(){
        Random random = new Random();
        User user;
        user = new User();
        user.setId(random.nextInt());
        user.setName("Akshay Chaudhary");
        user.setEmail("user@akshay.com");

        return user;
    }
}
