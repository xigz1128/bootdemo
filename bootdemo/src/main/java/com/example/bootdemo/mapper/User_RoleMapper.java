package com.example.bootdemo.mapper;

import com.example.bootdemo.bean.Role;
import com.example.bootdemo.bean.User;
import com.example.bootdemo.bean.User_Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface User_RoleMapper {

    User_Role checkRole(String user_id,String role_id);

    void deleteUser_RoleById(String id);

    void addUser_Role(String user_id, String role_id);
}
