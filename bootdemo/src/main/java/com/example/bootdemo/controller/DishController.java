package com.example.bootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dish")
public class DishController {

    @GetMapping("view.do")
    public String viewDish(){
        return "viewdish";
    }

}
