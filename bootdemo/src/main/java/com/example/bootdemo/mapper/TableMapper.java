package com.example.bootdemo.mapper;

import com.example.bootdemo.bean.Table;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TableMapper {
    List<Table> getTables();
    void UpdataTable(Table table);
}
