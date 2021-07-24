package com.example.bootdemo.service;


import com.example.bootdemo.bean.User;

import java.util.List;

public interface IUserService {
    //验证登录
    User checkUserLogin(String user_name, String password);
    /*
    //注册一个用户
    void add(String user_id,String password);
    */
    //查询所有用户信息
    List<User> getUser();
    //通过id查询用户信息
    User getUserById(String id);
    // 增加一个用户
    void addUser(User user);
    //修改用户信息
    void updateUser(User user);
    //删除用户
    void deleteUser(String id);
    //查询Users表中是否存在该用户
    User checkUserId(String user_id);

}
