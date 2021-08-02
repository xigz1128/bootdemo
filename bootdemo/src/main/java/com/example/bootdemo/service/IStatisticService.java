package com.example.bootdemo.service;

import com.example.bootdemo.bean.StaVo;
import com.example.bootdemo.bean.Statistic;

import java.util.List;

public interface IStatisticService {
List<Statistic> getOrder();

List<Statistic> getList();
List<StaVo> SaleHist();
List<StaVo> ProfitHist();

String DaySale();

String DayProfit();

String TotalProfit();

String TotalSales();
}
