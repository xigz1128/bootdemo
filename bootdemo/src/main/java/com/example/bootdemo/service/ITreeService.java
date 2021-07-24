package com.example.bootdemo.service;

import com.example.bootdemo.bean.Tree;

import java.util.List;

public interface ITreeService {
    List<Tree> getTreeByRole(String role_id);
}
