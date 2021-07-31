package com.example.bootdemo.controller;

import com.example.bootdemo.bean.Role;
import com.example.bootdemo.bean.Tree;
import com.example.bootdemo.bean.User;
import com.example.bootdemo.service.IRoleService;
import com.example.bootdemo.service.ITreeService;
import com.example.bootdemo.service.IUserService;
import com.example.bootdemo.service.IUser_RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.*;

@Controller
public class UserController {

    @Autowired
    private IUserService userService;
    @Autowired
    private IRoleService roleService;
    @Autowired
    private ITreeService treeService;
    @Autowired
    private IUser_RoleService user_roleService;

    /*进入登录页面*/
    @RequestMapping("/toLogin")
    public String toLogin() {
        return "login";
    }

    /*接收账号和密码，进行登录*/
    @PostMapping("main")
    public String Login(HttpSession session, String user_name, String password, Model model) {
        User user = userService.checkUserLogin(user_name, password);
        if (user == null) {
            model.addAttribute("data", "用户名或密码错误，请检查后再重新进行登录");
            return "login";
        } else {
            /*菜单获取*/
            List<Tree> treeList = new ArrayList<Tree>();
            List<String> treeIdList = new ArrayList<String>();
            user.setRoleList(roleService.getRoleByUser(user.getUser_id()));
            for (Role role : user.getRoleList()) {
                List<Tree> tree = treeService.getTreeByRole(role.getRole_id());
                role.setTreeList(tree);
                //菜单去重
                for (Tree tree1 : tree) {
                    if (!treeIdList.contains(tree1.getTree_id())) {
                        treeIdList.add(tree1.getTree_id());
                        treeList.add(tree1);
                    }
                }
            }
            /*构造菜单父子结构*/
            for (Tree tree : treeList) {
                if (tree.getIsparent().equals("true")) {
                    //如果是父菜单就执行
                    List<Tree> childTrees = unlimitTree(tree, treeList);
                    tree.setChildTrees(childTrees);
                }
            }
            //去重非顶级菜单
            List<Tree> temp = new ArrayList<Tree>();
            for (Tree tree : treeList) {
                if (tree.getParent_id() != null) {
                    temp.add(tree);
                }
            }
            treeList.removeAll(temp);
            model.addAttribute("userTreeList", treeList);
            session.setAttribute("user", user);
            return "main";
        }
    }

    public List<Tree> unlimitTree(Tree pTree, List<Tree> treeList) {
        List<Tree> childTrees = new ArrayList<Tree>();
        for (Tree tree : treeList) {
            if (tree.getParent_id() != null) {
                if (tree.getParent_id().equals(pTree.getTree_id())) {
                    childTrees.add(tree);
                }
            }
        }
        return childTrees;
    }

    //跳转到注册页面
    @RequestMapping("/toRegister")
    public String toRegister(Model model) {
        //List<Role> roles = roleService.getRole();
        //model.addAttribute("roles",roles);
        return "register";
    }

    //注册用户
    @RequestMapping("/RegisterSuccess")
    public String toRegisterMain(Model model, User user,String user_id,String user_name,String password,String password2,String realname,String phone,String address, String role_id) {
        System.out.println(password);
        System.out.println(password2);
        if (user_id == ""||user_name==""||password==""||password2==""||realname==""||phone==""||address=="") {
            model.addAttribute("data", "注册失败，请检查信息是否填写完整");
            return "register";
        }
        else if (userService.checkUserLogin(user_name, password) == null && password.equals(password2)){
            userService.addUser(user);
            user_roleService.addUser_Role(user_id, role_id);
            model.addAttribute("data", "注册成功，请登录");
            return "register";
        }
        else if(userService.checkUserLogin(user_name, password) == null && !password.equals(password2)){
            model.addAttribute("data","两次输入的密码不一致，请重新输入");
            return "register";
        }
        else {
            model.addAttribute("data", "注册的用户名重复，请重新注册");
            return "register";
        }
    }

    //获得员工列表
    @GetMapping("userList")
    public String getUser(Model model){
        Collection<User> users=userService.getUser();
        model.addAttribute("users",users);
        return "user/userList";
    }

    //去员工添加页面
    @GetMapping("addUser")
    public String toAddUser(){
        return "user/addUser";
    }
    //保存添加的信息进入数据库
    @PostMapping("addUser")
    public String addUser(Model model,User user,String user_id,String user_name,String password,String realname,String phone,String address){
        if(user_id==""||user_name==""||password==""||realname==""||phone==""||address==""){
            model.addAttribute("data","请将信息填写完整");
            return "user/addUser";
        }else {
            userService.addUser(user);
            return "redirect:/userList";
        }
    }

    //去员工修改页面
    @GetMapping("toUpdateUser")
    public String toUpdateUser(String id, Model model){
        //查出原来的数据
        User user =userService.getUserById(id);
        model.addAttribute("user",user);
        return "user/update";
    }
    //修改好的信息保存到数据库
    @PostMapping("/updateUser")
    public String updateUser(User user){
        userService.updateUser(user);
        return "redirect:/userList";
    }

    //删除员工信息
    @GetMapping("deleteUser")
    public String deleteUser(String id){
        user_roleService.deleteUser_RoleById(id);
        userService.deleteUser(id);
        return "redirect:/userList";
    }

    //通过关键字查询用户信息
    @PostMapping("selectUser")
    public String getUserById(String user,Model model){
        if (userService.getUserByUser(user)!=null){
            List<User> userList = userService.getUserByUser(user);
            model.addAttribute("user",userList);
            return "user/selectUser";
        }else {
            return "user/error2";
        }
    }

    //去用户授权界面
    @GetMapping("toAuthorizationUser")
    public String toAuthorizationUser(String id,Model model){
        model.addAttribute("role",roleService.getRole());
        User user = userService.getUserById(id);
        model.addAttribute("user",user);
        return "user/authorizationUser";
    }

    @PostMapping("authorizationUser")
    public String authorizationUser(String role_id,String user_id){
        if (user_roleService.checkRole(user_id,role_id)!=null){
            return "user/error";
        }else {
            user_roleService.addUser_Role(user_id,role_id);
            return "redirect:/userList";
        }
    }
}
