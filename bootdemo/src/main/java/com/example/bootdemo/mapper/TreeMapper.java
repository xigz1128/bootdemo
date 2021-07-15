package com.example.bootdemo.mapper;

import com.example.bootdemo.bean.Tree;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TreeMapper {
    List<Tree> getAllTrees();
}
