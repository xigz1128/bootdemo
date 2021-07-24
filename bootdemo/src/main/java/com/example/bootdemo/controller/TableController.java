package com.example.bootdemo.controller;

import com.example.bootdemo.bean.Table;
import com.example.bootdemo.service.ITableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/table")
public class TableController {
    @Autowired
    private ITableService tableService;

    //跳转到餐桌界面，并显示餐桌
    @GetMapping("view.do")
    public String viewtable(HttpServletRequest request){
        request.setAttribute("tableList",tableService.getTables());
        return "table/tb_view";
    }

    //显示界面跳转到修改界面，保存需要修改的行的信息，在修改界面输出
    @GetMapping("toUpdata.do")
    public String toUpdata(HttpServletRequest request,String table_id,String table_norm,String table_site){
        request.setAttribute("table_id",table_id);
        request.setAttribute("table_norm",table_norm);
        request.setAttribute("table_site", table_site);
        return "table/tb_updata";
    }

    //修改界面点击修改后，在数据库中实现修改
    @GetMapping("Updata.do")
    public  String Updata(HttpServletRequest request,String table_id,String table_norm,String table_site){
        Table table = new Table();
        table.setTable_id(table_id);
        table.setTable_norm(table_norm);
        table.setTable_site(table_site);
        tableService.UpdataTable(table);
        //重新查询,并放入作用域
        request.setAttribute("tableList",tableService.getTables());
        return "table/tb_view";//转跳回显示界面
    }


}
