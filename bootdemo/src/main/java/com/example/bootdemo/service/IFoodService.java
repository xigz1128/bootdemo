package com.example.bootdemo.service;

import com.example.bootdemo.bean.Food;

import java.util.List;

public interface IFoodService {
    //获取全部食物信息
    List<Food> getAllFood();

    //获取改id下的食物信息
    List<Food> getFoodById(String food);

    //修改食物列表信息
    void updateFood(Food food);

    //添加一条食物信息
    void addFood(Food food);

    //删除一条食物信息
    void deleteFood(String id);
}
