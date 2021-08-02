package com.example.bootdemo.mapper;

import com.example.bootdemo.bean.StaVo;
import com.example.bootdemo.bean.Statistic;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StatisticMapper {
List<Statistic> getOrder();

List<Statistic> getList();

List<StaVo> SaleHist();

List<StaVo> ProfitHist();

String DaySale();

String DayProfit();

String TotalProfit();

String TotalSales();
}
