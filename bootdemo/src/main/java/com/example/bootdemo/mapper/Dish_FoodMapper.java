package com.example.bootdemo.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Dish_FoodMapper {
    void deleteDF(String id);
}
