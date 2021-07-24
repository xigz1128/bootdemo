package com.example.bootdemo.service.impl;


import com.example.bootdemo.bean.Cart;
import com.example.bootdemo.bean.Dishes;
import com.example.bootdemo.mapper.DishesMapper;
import com.example.bootdemo.service.IDishesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishesServiceimpl implements IDishesService {

    @Autowired
    private DishesMapper dishesMapper;

    @Override
    public List<Dishes> showDishes(){
        return dishesMapper.showDishes();
    }



    @Override
    public List<Dishes> selectContent(String content) {

        return dishesMapper.selectContent(content);
    }

}
