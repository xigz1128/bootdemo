package com.example.bootdemo.controller;

import com.example.bootdemo.bean.Statistic;
import com.example.bootdemo.service.IStatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
@RequestMapping("/statistic")
public class StatisticController {
    @Autowired
    private IStatisticService StatisticService;
    @GetMapping("view.do")
    public String viewstatistic(Model model){
        Collection<Statistic> orderList = StatisticService.getOrder();
        model.addAttribute("orderList",orderList);
        return "statistic";
    }


}
