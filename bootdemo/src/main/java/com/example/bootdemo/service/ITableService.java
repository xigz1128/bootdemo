package com.example.bootdemo.service;

import com.example.bootdemo.bean.Table;

import java.util.List;

public interface ITableService {
    List<Table> getTables();
    void UpdataTable(Table table);
}
