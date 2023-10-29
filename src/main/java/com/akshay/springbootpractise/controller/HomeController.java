package com.akshay.springbootpractise.controller;

import com.akshay.springbootpractise.models.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class HomeController {

    private final List<User> users = new ArrayList<>();

    Random random = new Random();

    // Constructor to populate sample users
    public HomeController() {
        for (int i = 1; i <= 20; i++) {
            User user = new User();
            user.setId(i);
            user.setName("User" + i);
            user.setEmail("user" + i + "@example.com");
            users.add(user);
        }
    }

    @RequestMapping("/")
    public String home(){
        return "Hello world!";
    }

//    @RequestMapping("/user")
    @GetMapping("/user")
    public User userObject(){
        User user;
        user = new User();
        user.setId(random.nextInt());
        user.setName("Akshay Chaudhary");
        user.setEmail("user@akshay.com");

        return user;
    }

    /*@GetMapping("/request-param")
    public String requestParam(@RequestParam String name){
        return "Your name is : " + name;
    }*/

    @GetMapping("/path-variable/{id}")
    public User getUserById(@PathVariable String id) {
        // Search for the user by ID in the list of sample users
        for (User user : users) {
            if (user.getId() == Integer.parseInt(id)) {
                return user;
            }
        }
        User user;
        user = new User();
        user.setId(random.nextInt());
        user.setName("Akshay Chaudhary");
        user.setEmail("user@akshay.com");

        return user;// User not found
    }

    @GetMapping("/request-param")
    public User getUserByName(@RequestParam String name) {
        // Search for the user by name in the list of sample users
        for (User user : users) {
            if (user.getName().equalsIgnoreCase(name)) {
                return user;
            }

        }
        User user;
        user = new User();
        user.setId(random.nextInt());
        user.setName("Akshay Chaudhary");
        user.setEmail("user@akshay.com");

        return user;
    }
}
