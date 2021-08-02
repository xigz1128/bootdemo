package com.example.bootdemo.controller;


import com.example.bootdemo.bean.Cart;
import com.example.bootdemo.bean.Cartvo;
import com.example.bootdemo.bean.User;
import com.example.bootdemo.service.ICartService;
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

    @GetMapping ("toReduce.do")
    public String toReduce(HttpServletRequest request,String user_id,String dish_id,int amount){
        Cartvo cart = new Cartvo(user_id,dish_id,amount-1);
        cartService.updataAmount(cart);
        return "redirect:/cart/view.do";
    }

    @GetMapping ("toDelete.do")
    public String toDelete(HttpServletRequest request,String user_id,String dish_id){
        cartService.deleteDish(user_id,dish_id);
        return "redirect:/cart/view.do";
    }

    @GetMapping("/view")
    private String seeCart(HttpSession session,String dish_id,HttpServletRequest request){
        User user= (User) session.getAttribute("user");
        cartService.addCart(user.getUser_id(),dish_id);
        return "redirect:/Dish/dishes.do";
    }
}