package com.jk.util;

import org.apache.ibatis.jdbc.SQL;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.Map;

public class OrderProvider {
    private final String TBL_ORDER = "t_purchase";

    public String queryOrderByParam(Map<String,String> link) {
        SQL sql = new SQL().SELECT("*").FROM(TBL_ORDER);
        if (link.get("status")!=null&&!"".equals(link.get("status"))){
            sql.WHERE("status = #{status}");
        }
        if (StringUtils.hasText(link.get("deng"))) {
            sql.WHERE("REGIST_STATUS = #{deng}");
        }
        if (StringUtils.hasText(link.get("prs"))){
            sql.WHERE("SUPPLIER like %#{prs}%");
        }
        if (StringUtils.hasText(link.get("prs"))){
            sql.WHERE("id like %#{prs}%");
        }
        if (StringUtils.hasText(link.get("buystart"))){
            sql.WHERE("purchase_date >= #{buystart}");
        }
        if (StringUtils.hasText(link.get("buyend"))){
            sql.WHERE("purchase_date <= #{buyend}");
        }
        return sql.toString();
    }
}
