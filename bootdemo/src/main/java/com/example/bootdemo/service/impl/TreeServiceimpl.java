package com.example.bootdemo.service.impl;

import com.example.bootdemo.bean.Tree;
import com.example.bootdemo.mapper.TreeMapper;
import com.example.bootdemo.service.ITreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreeServiceimpl implements ITreeService {
    @Autowired
    private TreeMapper treeMapper;

    @Override
    public List<Tree> getTreeByRole(String role) {
        return treeMapper.getTreeByRole(role);
    }

}
