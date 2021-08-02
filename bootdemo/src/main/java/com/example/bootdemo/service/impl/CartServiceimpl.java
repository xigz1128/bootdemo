package com.example.bootdemo.service.impl;


import com.example.bootdemo.bean.Cart;
import com.example.bootdemo.bean.Cartvo;
import com.example.bootdemo.mapper.CartMapper;
import com.example.bootdemo.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceimpl   implements ICartService {
    @Autowired
    private CartMapper cartMapper;

    @Override
    public List<Cart> getCartbyUser(String user_id) {
        return cartMapper.getCartByUser(user_id);
    }

    @Override
    public void deleteDish(String user_id, String dish_id) {
        cartMapper.deleteDish(user_id, dish_id);
    }

    @Override
    public void updataAmount(Cartvo cartvo) {
        cartMapper.updataAmount(cartvo);
    }

    @Override
    public List<Cart> addCart(String user_id,String dish_id) {
        return cartMapper.addCart(user_id,dish_id);
    }

    @Override
    public void deleteCartById(String id) {
        cartMapper.deleteCartById(id);
    }

}