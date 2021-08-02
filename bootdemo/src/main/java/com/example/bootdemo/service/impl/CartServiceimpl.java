package com.example.bootdemo.service.impl;


import com.example.bootdemo.bean.Cart;
import com.example.bootdemo.bean.Cartvo;
import com.example.bootdemo.mapper.CartMapper;
import com.example.bootdemo.mapper.DishesMapper;
import com.example.bootdemo.mapper.UserMapper;
import com.example.bootdemo.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service
public class CartServiceimpl   implements ICartService {
    @Autowired
    private CartMapper cartMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private DishesMapper dishesMapper;

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

    public List<Cart> addCarts(String user_id,String dish_id) {

        cartMapper.addCarts(user_id,dish_id);
        return null;
    }


    @Override
    public List<Cart> updateCarts(String user_id,int amount, String dish_id) {
        List<Cart> cartList=cartMapper.selectCarts(user_id,dish_id);
        cartMapper.updateCarts(cartList.get(0).getAmount(),dish_id);
        return null;
    }

    @Override
    public List<Cart> updateCarts2(String user_id, int amount, String dish_id) {
        List<Cart> cartList=cartMapper.selectCarts(user_id,dish_id);
        cartMapper.updateCarts(cartList.get(0).getAmount(),dish_id);
        return null;
    }


    @Override
    public List<Cart> selectCarts(String user_id,String dish_id){
        List<Cart> cartList=cartMapper.selectCarts(user_id,dish_id);
        if (cartList.size()==0){
            cartMapper.addCarts(user_id,dish_id);

        }
        else if (cartList.get(0).getAmount()==0){

            cartMapper.updateCarts(cartList.get(0).getAmount(),dish_id);
        }else {

            //int amount = cartList.getAmount() + 1;
            cartMapper.updateCarts(cartList.get(0).getAmount(),dish_id);
        }
        return null;
    }


    @Override
    public List<Cart> deleteCarts(String user_id, String dish_id) {
        List<Cart> cartList=cartMapper.selectCarts(user_id,dish_id);

        if (cartList.get(0).getAmount()<1){
            dishesMapper.showDishes();


        }else {

            //int amount = cartList.getAmount() + 1;
            cartMapper.updateCarts2(cartList.get(0).getAmount(),dish_id);
        }
        return null;
    }


    public void deleteCartById(String id) {
        cartMapper.deleteCartById(id);
    }
}