package com.example.bootdemo.controller;

import com.example.bootdemo.bean.Food;
import com.example.bootdemo.service.IDish_FoodService;
import com.example.bootdemo.service.IFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class FoodController {

    @Autowired
    private IFoodService foodService;
    @Autowired
    private IDish_FoodService dish_foodService;


    //获得食物列表
    @GetMapping("stock/view.do")
    public String getAllFood(Model model){
        List<Food> foodList = foodService.getAllFood();
        model.addAttribute("foodList",foodList);
        return "food/foodList";
    }

    //修改食物列表信息,首先要去到修改信息的界面
    @GetMapping("toUpdateFood")
    public String toUpdateFood(String food,Model model){
        //获取改id下的食物信息
        List<Food> Food = foodService.getFoodById(food);
        model.addAttribute("food",Food);
        return "food/updateFood";
    }

    //提交修改完毕的信息进数据库
    @PostMapping("updateFood")
    public String updateFood(Food food,Model model){
        //修改食物信息
        foodService.updateFood(food);
        //修改好食物信息之后再次获取当前Food表中的信息
        List<Food> foods = foodService.getAllFood();
        model.addAttribute("foods",foods);
        return "redirect:/stock/view.do";
    }

    //添加一条食物信息,首先去到添加食物信息界面
    @GetMapping("addFood")
    public String toAddFood(){
        return "food/addFood";
    }
    //提交添加好的数据进数据库
    @PostMapping("addFood")
    public String addFood(Food food){
        foodService.addFood(food);
        //添加好食物信息之后再次获取当前Food表中的信息
        //List<Food> foods = foodService.getAllFood();
        return "redirect:/stock/view.do";
    }
/*方法一：
    //删除一条食物信息
    @GetMapping("deleteFood")
    public String deleteFood(String id,Model model){
        foodService.deleteFood(id);
        List<Food> foodList = foodService.getAllFood();
        model.addAttribute("foodList",foodList);
        return "food/foodList";
    }
 */
//方法二：
    //删除一条食物信息
    @GetMapping("deleteFood")
    public String deleteFood(String id){
        dish_foodService.deleteDF(id);
        foodService.deleteFood(id);
        return "redirect:/stock/view.do";
    }

    //通过id查询食物信息
    @PostMapping("selectFood")
    public String getFoodById(String food,HttpServletRequest request){
        System.out.println(food);
        List<Food> Food= foodService.getFoodById(food);
        request.setAttribute("food",Food);
        return "food/selectFood";
    }

}
