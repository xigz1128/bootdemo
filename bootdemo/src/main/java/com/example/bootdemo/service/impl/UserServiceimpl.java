package com.example.bootdemo.service.impl;

import com.example.bootdemo.bean.User;
import com.example.bootdemo.mapper.UserMapper;
import com.example.bootdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    //验证登录
    @Override
    public User checkUserLogin(String user_name, String password) {
        User user = userMapper.checkUserLogin(user_name,password);
        return user;
    }

    /*//注册一个用户
    public void add(String user_id,String password) {
        userMapper.add(user_id,password);
    }*/

    //查询所有用户信息
    @Override
    public List<User> getUser() {
        List<User> userList = userMapper.getUser();
        return userList;
    }

    //通过id查询用户信息
    @Override
    public User getUserById(String id) {
        User user=userMapper.getUserById(id);
        return user;
    }

    // 增加一个用户
    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    // 修改用户信息
    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    //删除用户
    @Override
    public void deleteUser(String id) {
        userMapper.deleteUser(id);
    }

    @Override
    public User checkUserId(String user_id) {
        User user = userMapper.checkUserId(user_id);
        return user;
    }
}
