package com.example.bootdemo.service;

import com.example.bootdemo.bean.Cart;
import com.example.bootdemo.bean.Dishes;

import java.util.List;

public interface IDishesService {
    List<Dishes> showDishes();
    List<Dishes> selectContent(String content);


}
