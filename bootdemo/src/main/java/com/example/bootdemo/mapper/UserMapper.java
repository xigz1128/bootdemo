package com.example.bootdemo.mapper;

import com.example.bootdemo.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    //检查登录
    User checkUserLogin(String user_name, String password);

    //User popUserLogin(String user_name, String password);

    //注册用户
    // void add(User user);


    //查询所有用户信息
    List<User> getUser();
    //通过id查询用户信息
    User getUserById(String id);
    //通过关键字查询用户信息
    List<User> getUserByUser(String user);
    // 增加一个用户
    void addUser(User user);
    //修改用户信息
    void updateUser(User user);
    //删除用户
    void deleteUser(String id);
    //查询Users表中是否存在该用户
    User checkUserId(String user_id);
}
