package com.example.bootdemo.service.impl;

import com.example.bootdemo.bean.Table;
import com.example.bootdemo.mapper.TableMapper;
import com.example.bootdemo.mapper.TreeMapper;
import com.example.bootdemo.service.ITableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TableServiceimpl implements ITableService {
    @Autowired
    private TableMapper tableMapper;

    @Override
    public List<Table> getTables() {
        return tableMapper.getTables();
    }

    @Override
    public void UpdataTable(Table table) {
        tableMapper.UpdataTable(table);
    }

}
