package com.example.bootdemo.controller;

import com.example.bootdemo.bean.StaVo;
import com.example.bootdemo.bean.Statistic;
import com.example.bootdemo.service.IStatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/statistic")
public class StatisticController {
    @Autowired
    private IStatisticService StatisticService;

    @GetMapping("view.do")
    public String viewstatistic(Model model){
        List<Statistic> orderList = StatisticService.getOrder();
        model.addAttribute("orderList",orderList);
        List<Statistic> payList = StatisticService.getList();
        model.addAttribute("payList",payList);
//      model.addAttribute("sale",sale);
//      model.addAttribute("profit",profit);
//      model.addAttribute("date",date);
        model.addAttribute("DaySale",StatisticService.DaySale());
        model.addAttribute("DayProfit",StatisticService.DayProfit());
        model.addAttribute("TotalProfit",StatisticService.TotalProfit());
        model.addAttribute("TotalSales",StatisticService.TotalSales());
        return "statistic";
    }

    @ResponseBody
    @GetMapping("getChart")
    public Map<String, Object> getChart() {
        Map<String, Object> map = new HashMap<>(2);
        List<StaVo> SaleHist=StatisticService.SaleHist();
        List<StaVo> ProfitHist=StatisticService.ProfitHist();
        float[] sale = new float[SaleHist.size()];
        float[] profit = new float[ProfitHist.size()];
        String[] xAxis = new String[ProfitHist.size()];

        int i = 0;
        for (StaVo staVo : SaleHist) {
            sale[i] = staVo.getWeeklySale();
            xAxis[i] = staVo.getSaleTime();
            i++;
        }
        i = 0 ;
        for (StaVo staVo : ProfitHist) {
            profit[i] = staVo.getWeeklyProfit();
            i++;
        }
        map.put("sale", sale);
        map.put("profit", profit);
        map.put("xAxis", xAxis);
        return map;
    }



}
