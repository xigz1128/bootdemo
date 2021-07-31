package com.example.bootdemo.service.impl;

import com.example.bootdemo.bean.Food;
import com.example.bootdemo.mapper.FoodMapper;
import com.example.bootdemo.service.IFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl implements IFoodService {

    @Autowired
    private FoodMapper foodMapper;

    @Override
    public List<Food> getAllFood() {
        List<Food> food = foodMapper.getAllFood();
        return food;
    }

    @Override
    public List<Food> getFoodById(String food) {
        return foodMapper.getFoodById(food);
    }

    @Override
    public void updateFood(Food food) {
        foodMapper.updateFood(food);
    }

    @Override
    public void addFood(Food food) {
        foodMapper.addFood(food);
    }

    @Override
    public void deleteFood(String id) {
        foodMapper.deleteFood(id);
    }

    @Override
    public Food getFood(String id) {
        Food food = foodMapper.getFood(id);
        return food;
    }

}
