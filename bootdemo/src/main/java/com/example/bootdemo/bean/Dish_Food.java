package com.example.bootdemo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dish_Food {
    private String dish_id;
    private String food_id;
    private String amount;
}
