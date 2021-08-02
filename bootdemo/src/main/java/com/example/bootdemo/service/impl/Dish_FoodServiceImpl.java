package com.example.bootdemo.service.impl;

import com.example.bootdemo.mapper.Dish_FoodMapper;
import com.example.bootdemo.service.IDish_FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Dish_FoodServiceImpl implements IDish_FoodService {

    @Autowired
    private Dish_FoodMapper dish_foodMapper;

    @Override
    public void deleteDish_Food(String id) {
        dish_foodMapper.deleteDish_Food(id);
    }
}
