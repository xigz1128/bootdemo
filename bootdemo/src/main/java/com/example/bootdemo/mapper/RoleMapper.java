package com.example.bootdemo.mapper;

import com.example.bootdemo.bean.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleMapper {
    List<Role> getRoleByUser(String user_id);
    List<Role> getRole();

}
