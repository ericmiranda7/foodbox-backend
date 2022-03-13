package com.foodbox.foodbox.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class UserController {
    @GetMapping("")
    public String home() {
        System.out.println("reached");
        return "Reached home! something something";
    }
}
