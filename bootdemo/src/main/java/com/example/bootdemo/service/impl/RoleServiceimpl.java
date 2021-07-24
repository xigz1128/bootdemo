package com.example.bootdemo.service.impl;

import com.example.bootdemo.bean.Role;
import com.example.bootdemo.mapper.RoleMapper;
import com.example.bootdemo.service.IRoleService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleServiceimpl implements IRoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> getRoleByUser(String user_id) {
        return roleMapper.getRoleByUser(user_id);
    }

    @Override
    public List<Role> getRole() {
        List<Role> role = roleMapper.getRole();
        return role;
    }
}
