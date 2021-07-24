package com.example.bootdemo.service;

import com.example.bootdemo.bean.Role;
import com.example.bootdemo.bean.User;
import com.example.bootdemo.bean.User_Role;

import java.util.List;

public interface IUser_RoleService {

    User_Role checkRole(String user_id,String role_id);

    void deleteUser_RoleById(String id);

    void addUser_Role(String user_id, String role_id);
}
