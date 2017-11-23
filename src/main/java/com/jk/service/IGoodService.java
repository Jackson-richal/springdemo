package com.jk.service;

import com.jk.model.Purchase;

import java.util.Map;

/**
 * Created by Administrator on 2017/11/14.
 */
public interface IGoodService {

    public String selAllPurchase(Map<String,String> map);

    String selAllUser();

    void addGood(Purchase purchase);
}
