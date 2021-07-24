package com.example.bootdemo.service.impl;

import com.example.bootdemo.bean.Statistic;
import com.example.bootdemo.mapper.StatisticMapper;
import com.example.bootdemo.service.IStatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatisticServiceimpl implements IStatisticService {
    @Autowired
    private StatisticMapper statisticMapper;
    @Override
    public List<Statistic> getOrder(){
        List<Statistic> statisticList = statisticMapper.getOrder();
        for (Statistic statistic:statisticList){
        }
        return statisticMapper.getOrder();
    }
}


