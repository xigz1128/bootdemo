package com.example.bootdemo.bean;
import org.springframework.beans.factory.annotation.Autowired;

public class User_Role {
    private String user_id;

    public String getUser_id() {
        return user_id;
    }

    public User_Role() {
    }

    public User_Role(String user_id, String role_id) {
        this.user_id = user_id;
        this.role_id = role_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    private String role_id;
}
