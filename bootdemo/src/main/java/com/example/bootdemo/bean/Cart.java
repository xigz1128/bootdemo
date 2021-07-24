package com.example.bootdemo.bean;

import java.util.List;

public class Cart {
    private String user_id;
    private String dish_id;
    private Integer amount;
    private Dishes dishes;

    public String getDish_id() {
        return dish_id;
    }

    public void setDish_id(String dish_id) {
        this.dish_id = dish_id;
    }

    public Cart() {
    }

    public Cart(String user_id, Integer amount, Dishes dishes) {
        this.user_id = user_id;
        this.amount = amount;
        this.dishes = dishes;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public Cart(Integer amount, Dishes dishes) {
        this.amount = amount;
        this.dishes = dishes;
    }

    public Dishes getDishes() {
        return dishes;
    }

    public void setDishes(Dishes dishes) {
        this.dishes = dishes;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

}