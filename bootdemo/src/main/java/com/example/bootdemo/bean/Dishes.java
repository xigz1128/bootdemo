package com.example.bootdemo.bean;

public class Dishes {
    private String dish_id;
    private String dish_name;
    private float price;
    private String type;
    private String sketch;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Dishes() {
    }

    public Dishes( String dish_id,String dish_name,float price,String type,String sketch) {
        this.dish_id=dish_id;
        this.dish_name=dish_name;
        this.price = price;
        this.sketch = sketch;
        this.type=type;
    }

    public String getDish_id() {
        return dish_id;
    }

    public void setDish_id(String dish_id) {
        this.dish_id = dish_id;
    }

    public String getDish_name() {
        return dish_name;
    }

    public void setDish_name(String dish_name) {
        this.dish_name = dish_name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


    public String getSketch() {
        return sketch;
    }

    public void setSketch(String sketch) {
        this.sketch = sketch;
    }
}
