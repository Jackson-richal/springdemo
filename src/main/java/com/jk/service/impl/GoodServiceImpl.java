package com.jk.service.impl;

import com.jk.dao.GoodMapper;
import com.jk.model.Purchase;
import com.jk.model.User;
import com.jk.service.IGoodService;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/11/14.
 */
@Service
public class GoodServiceImpl implements IGoodService {

    @Autowired
    private GoodMapper goodMapper;

    public String selAllPurchase(Map<String,String> map){
        List<Purchase> list = goodMapper.selAllPurchase(map);
        return JSONArray.fromObject(list).toString();
    }

    @Override
    public String selAllUser() {
        List<User> list = goodMapper.selAllUser();
        return JSONArray.fromObject(list).toString();
    }

    @Override
    public void addGood(Purchase purchase) {
        goodMapper.addGood(purchase);
    }
}
