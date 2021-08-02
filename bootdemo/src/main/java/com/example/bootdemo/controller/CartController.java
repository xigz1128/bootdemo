package com.example.bootdemo.controller;


import com.example.bootdemo.bean.Cart;
import com.example.bootdemo.bean.Cartvo;
import com.example.bootdemo.bean.User;
import com.example.bootdemo.mapper.CartMapper;
import com.example.bootdemo.service.ICartService;
import com.example.bootdemo.service.IDishesService;
import com.example.bootdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.reactive.WebFluxProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/cart")
public class CartController {

    @Autowired
    public ICartService cartService;
    @Autowired
    public IDishesService dishesService;
    @Autowired
    private IUserService userService;


    @GetMapping("view.do")
    public String toCartForm(HttpSession session, HttpServletRequest request){
        User user = (User) session.getAttribute("user");
        List<Cart> carts = cartService.getCartbyUser(user.getUser_id());
        for (Cart cart:carts){
            System.out.println(cart.getDishes().getDish_name());
        }
        request.setAttribute("cartList",carts);
        return "Cart/viewcart";
    }

    @GetMapping("toAdd.do")
    public String toUpdata(String user_id,String dish_id,int amount){
        Cartvo cart = new Cartvo(user_id,dish_id,amount+1);
        cartService.updataAmount(cart);
        return "redirect:/cart/view.do";
    }

    @GetMapping ("toDelete.do")
    public String toDelete(HttpServletRequest request,String user_id,String dish_id){
        cartService.deleteDish(user_id,dish_id);
        return "redirect:/cart/view.do";
    }

    @GetMapping ("toReduce.do")
    public String toReduce(HttpServletRequest request,String user_id,String dish_id,int amount){
        Cartvo cart = new Cartvo(user_id,dish_id,amount-1);
        cartService.updataAmount(cart);
        return "redirect:/cart/view.do";
    }

    @GetMapping("/view")
    private String seeCart(HttpSession session,String dish_id,HttpServletRequest request){
        User user= (User) session.getAttribute("user");
        cartService.addCart(user.getUser_id(),dish_id);
        return "redirect:/Dish/dishes.do";
    }


    @GetMapping("/views")
    private String seeCarts(HttpSession session,String dish_id,HttpServletRequest request){

        User user = (User) session.getAttribute("user");
        cartService.selectCarts(user.getUser_id(),dish_id);

        request.setAttribute("dishesList",dishesService.showDishes());
        return "dishes";

    }

    @GetMapping("/views2")
    private String delectCarts(HttpSession session,String dish_id,HttpServletRequest request){

        User user = (User) session.getAttribute("user");
        cartService.deleteCarts(user.getUser_id(),dish_id);

//        CartMapper cartMapper = null;
//
//        List<Cart> cartList=cartMapper.selectCarts(user_id,dish_id);

//        if (cartList.size()==0){
//            int message = cartList.get(0).getAmount();;
//            request.setAttribute("message","用户名或密码错误!");
//
//        }else {
//
//            //int amount = cartList.getAmount() + 1;
//            cartMapper.updateCarts2(cartList.get(0).getAmount(),dish_id);
//        }

        request.setAttribute("dishesList",dishesService.showDishes());
        return "dishes";
    }
}