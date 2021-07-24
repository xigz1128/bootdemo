package com.example.bootdemo.bean;

public class Food {
    public String getFood_id() {
        return food_id;
    }

    public void setFood_id(String food_id) {
        this.food_id = food_id;
    }

    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public String getInprice() {
        return inprice;
    }

    public void setInprice(String inprice) {
        this.inprice = inprice;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    private String food_id;
    private String food_name;
    private String inprice;

    public Food() {
    }

    public Food(String food_id, String food_name, String inprice, String stock) {
        this.food_id = food_id;
        this.food_name = food_name;
        this.inprice = inprice;
        this.stock = stock;
    }

    private String stock;
}
