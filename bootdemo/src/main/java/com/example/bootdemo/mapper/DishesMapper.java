package com.example.bootdemo.mapper;

import com.example.bootdemo.bean.Cart;
import com.example.bootdemo.bean.Dishes;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DishesMapper {
    List<Dishes> showDishes();
    List<Dishes> selectContent(String content);
    List<Cart> selectDish(String type);
}
