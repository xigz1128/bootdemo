package com.example.bootdemo.mapper;


import com.example.bootdemo.bean.Cart;
import com.example.bootdemo.bean.Cartvo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.util.List;

@Mapper
public interface CartMapper {
    List<Cart> getCartByUser(String user_id);
    void deleteDish(String user_id,String dish_id);
    void updataAmount(Cartvo cartvo);
    List<Cart> addCart(String user_id,String dish_id);

    void addCarts(String user_id,String dish_id);
    void updateCarts(@Param("amount") int amount, @Param("dish_id") String dish_id);
    List<Cart> selectCarts(String user_id,String dish_id);

    void deleteCarts(String user_id,String dish_id);

    void updateCarts2(@Param("amount") int amount, @Param("dish_id") String dish_id);

}
