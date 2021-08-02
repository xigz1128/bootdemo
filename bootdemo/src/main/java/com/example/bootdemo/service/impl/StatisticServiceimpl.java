package com.example.bootdemo.service.impl;

import com.example.bootdemo.bean.StaVo;
import com.example.bootdemo.bean.Statistic;
import com.example.bootdemo.mapper.StatisticMapper;
import com.example.bootdemo.service.IStatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.List;

@Service
public class StatisticServiceimpl implements IStatisticService {
    @Autowired
    private StatisticMapper statisticMapper;
    @Override
    public List<Statistic> getOrder(){
        List<Statistic> statisticList = statisticMapper.getOrder();
        return statisticList;
    }
    @Override
    public List<Statistic> getList(){
        List<Statistic> payList=statisticMapper.getList();
        return payList;
    }
    @Override
    public List<StaVo> SaleHist(){
        List<StaVo> saleList=statisticMapper.SaleHist();
        return saleList;
    }
    @Override
    public List<StaVo> ProfitHist(){
        List<StaVo> profitList=statisticMapper.ProfitHist();
        return profitList;
    }
    @Override
    public String DaySale(){
        return statisticMapper.DaySale();
    }
    @Override
    public  String DayProfit(){
        return statisticMapper.DayProfit();
    }
    @Override
    public String TotalProfit(){
        return statisticMapper.TotalProfit();
    }
    @Override
    public String TotalSales(){
        return statisticMapper.TotalSales();
    }
}


