package com.jk.controller;

import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import com.jk.model.Menu;
import com.jk.service.IMenuService;
import net.sf.json.JSONArray;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by Administrator on 2017/11/14.
 */
@RestController
public class MenuController extends BaseController{
    @Autowired
    private IMenuService iMenuService;

    @RequestMapping("/selAllMenu")
    public void treeList(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Menu> list = iMenuService.selAllMenu();
        String callback = request.getParameter("callback");
        String data = callback + "("+JSONArray.fromObject(list).toString()+")";
        super.outString(data,response);
    }
    /*@RequestMapping("/selAllMenu")
    public void treeList(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setCharacterEncoding("utf-8");
        String callback=request.getParameter("callback");
        String data = iMenuService.selAllMenu();
        String returnstr=callback+"("+data+")";
        PrintWriter out = response.getWriter();
        out.println(returnstr);
    }*/


}
