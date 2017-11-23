package com.jk.dao;

import com.jk.model.Purchase;
import com.jk.model.User;
import com.jk.util.OrderProvider;
import com.jk.util.SqlSelect;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/11/14.
 */
@Mapper
public interface GoodMapper {

    @Results({
            @Result(property = "purchaseDate",column = "purchase_date"),
            @Result(property = "purchaseMoney",column = "purchase_money"),
            @Result(property = "registStatus",column = "regist_status")
    })
    @SelectProvider(type = SqlSelect.class,method = "queryParam")
    public List<Purchase> selAllPurchase(Map<String,String> map);

    @Select("select * from t_user")
    List<User> selAllUser();

    @Insert(" insert into t_purchase ( supplier, purchase_date, \n" +
            "purchase_money, regist_status, status, \n" +
            "pay_amount, pay_date, arrival_date, \n" +
            "salesmae, remarks)\n" +
            "values ( #{supplier,jdbcType=VARCHAR}, #{purchaseDate,jdbcType=TIMESTAMP}, \n" +
            "#{purchaseMoney,jdbcType=DECIMAL}, #{registStatus,jdbcType=INTEGER}, #{status,jdbcType=INTEGER}, \n" +
            "#{payAmount,jdbcType=DECIMAL}, #{payDate,jdbcType=TIMESTAMP}, #{arrivalDate,jdbcType=TIMESTAMP}, \n" +
            "#{salesmae,jdbcType=INTEGER}, #{remarks,jdbcType=VARCHAR})")
    void addGood(Purchase purchase);
}
