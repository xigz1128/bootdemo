package com.example.bootdemo.service;

import com.example.bootdemo.bean.Cart;
import com.example.bootdemo.bean.Cartvo;

import java.util.List;

public interface ICartService {
    List<Cart> getCartbyUser(String user_id);
    void deleteDish(String userid, String dish_id);
    void updataAmount(Cartvo cartvo);
    List<Cart> addCart(String user_id,String content);

    void deleteCartById(String id);
}
