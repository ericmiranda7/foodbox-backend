package com.foodbox.foodbox.services;

import com.foodbox.foodbox.DAO.FoodMySQLDAO;
import com.foodbox.foodbox.models.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {
    private final FoodMySQLDAO foodMySQLDAO;

    @Autowired
    public FoodService(FoodMySQLDAO foodMySQLDAO) {
        this.foodMySQLDAO = foodMySQLDAO;
    }

    public List<Food> getAllFoods() {
        return this.foodMySQLDAO.getAll();
    }
}
