package com.example.bootdemo.bean;

public class Cartvo {
    private String user_id;
    private Integer amount;
    private String dish_id;

    public Cartvo() {
    }

    public Cartvo(String user_id, String dish_id, Integer amount) {
        this.user_id = user_id;
        this.amount = amount;
        this.dish_id = dish_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getDish_id() {
        return dish_id;
    }

    public void setDish_id(String dish_id) {
        this.dish_id = dish_id;
    }
}
