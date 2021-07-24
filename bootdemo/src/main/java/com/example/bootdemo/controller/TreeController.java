package com.example.bootdemo.controller;

import com.example.bootdemo.bean.Tree;
import com.example.bootdemo.bean.User;
import com.example.bootdemo.service.ITreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/tree")
public class TreeController {
    @Autowired
    private ITreeService iTreeService;

}
