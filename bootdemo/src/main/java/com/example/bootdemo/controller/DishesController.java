package com.example.bootdemo.controller;


import com.example.bootdemo.bean.Dishes;
import com.example.bootdemo.bean.User;
import com.example.bootdemo.service.IDishesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/Dish")
public class DishesController {

    @Autowired
    private IDishesService dishesService;

    @GetMapping("dishes2.do")
    public String selectDish(String type,HttpServletRequest request){
        request.setAttribute("dishesList",dishesService.selectDish(type));
        return "dishes";
    }

    @GetMapping("dishes.do")
    public String showDishes(HttpServletRequest request){
       request.setAttribute("dishesList",dishesService.showDishes());
        return "dishes";
    }

    @GetMapping("content.do")
    public String search(String content, HttpServletRequest request){
        List<Dishes> dishesList=dishesService.selectContent(content);
        request.setAttribute("dishesList",dishesList);
        return "dishes";
    }


}
