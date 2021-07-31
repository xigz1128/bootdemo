package com.example.bootdemo.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Dish_FoodMapper {

    //删除
    void deleteDish_Food(String id);

    //添加food_id进入dish_food表
    void addFood_id(String food_id);
}
