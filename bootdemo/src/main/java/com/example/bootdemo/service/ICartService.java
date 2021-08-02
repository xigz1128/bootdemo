package com.example.bootdemo.service;

import com.example.bootdemo.bean.Cart;
import com.example.bootdemo.bean.Cartvo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ICartService {
    List<Cart> getCartbyUser(String user_id);
    void deleteDish(String userid, String dish_id);
    void updataAmount(Cartvo cartvo);
    List<Cart> addCart(String user_id,String content);

    List<Cart> addCarts(String user_id,String dish_id);
    List<Cart> updateCarts(String user_id,@Param("amount") int amount, @Param("dish_id") String dish_id);
    List<Cart> updateCarts2(String user_id,@Param("amount") int amount, @Param("dish_id") String dish_id);
    List<Cart> selectCarts(String user_id,String dish_id);
    List<Cart> deleteCarts(String user_id,String dish_id);

}
