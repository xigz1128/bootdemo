package com.example.bootdemo.mapper;

import com.example.bootdemo.bean.Statistic;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StatisticMapper {
List<Statistic> getOrder();
}
