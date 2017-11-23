package com.jk.controller;

import com.jk.model.Purchase;
import com.jk.service.IGoodService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;

/**
 * Created by Administrator on 2017/11/14.
 */
@RestController
public class GoodController extends BaseController{

    @Autowired
    private IGoodService goodService;

    /**
     * 查询所有订货单信息
     * @param map
     * @param request
     * @param response
     * @throws IOException
     */
    @RequestMapping("/selAllPurchase")
    public void selAllPurchase(@RequestParam Map<String,String> map, HttpServletRequest request, HttpServletResponse response) throws IOException {
        String data = goodService.selAllPurchase(map);
        String callback = request.getParameter("callback")+"("+data+")";
        super.outString(callback,response);
    }

    /**
     * 查询所有用户信息
     * @param request
     * @param response
     */
    @RequestMapping("/selAllUser")
    public void selAllUser(HttpServletRequest request,HttpServletResponse response){
        String data = goodService.selAllUser();
        String callback = request.getParameter("callback")+"("+data+")";
        super.outString(callback,response);
    }

    @RequestMapping("/addGood")
    public void addGood(Purchase purchase,String buytime,String paytime,String gettime,HttpServletRequest request,HttpServletResponse response){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            purchase.setPurchaseDate(sdf.parse(buytime));
            purchase.setPayDate(sdf.parse(paytime));
            purchase.setArrivalDate(sdf.parse(gettime));
            goodService.addGood(purchase);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        super.outString("1",response);
    }

}
