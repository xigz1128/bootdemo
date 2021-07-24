package com.example.bootdemo.service.impl;

import com.example.bootdemo.bean.Role;
import com.example.bootdemo.bean.User;
import com.example.bootdemo.bean.User_Role;
import com.example.bootdemo.mapper.User_RoleMapper;
import com.example.bootdemo.service.IUser_RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class User_RoleServiceImpl implements IUser_RoleService {

    @Autowired
    private User_RoleMapper user_roleMapper;

    @Override
    public User_Role checkRole(String user_id, String role_id) {
        return user_roleMapper.checkRole(user_id,role_id);
    }

    @Override
    public void deleteUser_RoleById(String id) {
        user_roleMapper.deleteUser_RoleById(id);
    }

    @Override
    public void addUser_Role(String user_id, String role_id) {
        user_roleMapper.addUser_Role(user_id,role_id);
    }

}
