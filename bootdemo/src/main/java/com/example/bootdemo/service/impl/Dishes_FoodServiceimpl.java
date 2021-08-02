package com.example.bootdemo.service.impl;

import com.example.bootdemo.mapper.Dish_FoodMapper;
import com.example.bootdemo.service.IDish_FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class Dishes_FoodServiceimpl implements IDish_FoodService {
    @Autowired
    private Dish_FoodMapper dish_foodMapper;

    @Override
    public void deleteDF(String id){
        dish_foodMapper.deleteDF(id);
    }
}


