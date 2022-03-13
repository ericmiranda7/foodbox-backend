package com.foodbox.foodbox.controllers;

import com.foodbox.foodbox.models.Food;
import com.foodbox.foodbox.services.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class MainController {
    private final FoodService foodService;

    @Autowired
    public MainController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping("/login")
    public Map<String, String> login() {
        return Map.of("status", "success");
    }

    @GetMapping("/foods")
    public List<Food> getFoods() {
        return this.foodService.getAllFoods();
    }
}
