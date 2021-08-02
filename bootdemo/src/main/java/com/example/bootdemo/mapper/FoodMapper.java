package com.example.bootdemo.mapper;

import com.example.bootdemo.bean.Food;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FoodMapper {

    //获取全部食物信息
    List<Food> getAllFood();

    //获取关键字"food"下的食物信息
    List<Food> getFoodById(String food);

    //修改食物列表信息
    void updateFood(Food food);

    //添加一条食物信息
    void addFood(Food food);

    //删除一条食物信息
    void deleteFood(String id);

    //获取改id下的食物信息
    Food getFood(String id);

}
