package com.example.bootdemo.service;

import com.example.bootdemo.bean.Role;

import java.util.List;

public interface IRoleService {
    List<Role> getRoleByUser(String user_id);
    List<Role> getRole();
}
