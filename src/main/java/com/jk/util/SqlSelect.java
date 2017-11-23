package com.jk.util;

import java.util.Map;

/**
 * Created by Administrator on 2017/11/15.
 */
public class SqlSelect {

    public String queryParam(Map<String,String> map){
        final String status = map.get("status");
        final String deng = map.get("deng");
        final String buystart = map.get("buystart");
        final String buyend = map.get("buyend");
        final String prs = map.get("prs");

        StringBuffer sb = new StringBuffer();
        sb.append("select * from t_purchase where 1=1 ");
        if(status!=null&&!"".equals(status)){
            sb.append(" and status ="+status);
        }
        if(deng!=null&&!"".equals(deng)){
            sb.append(" and REGIST_STATUS ="+deng);
        }
        if(prs!=null&&!"".equals(prs)){
            sb.append(" and (SUPPLIER like '%"+prs+"%' or id like '%"+prs+"%')");
        }
        if(buystart!=null&&!"".equals(buystart)){
            sb.append(" and purchase_date >= '"+buystart+"'");
        }
        if(buyend!=null&&!"".equals(buyend)){
            sb.append(" and purchase_date <= '"+buyend+"'");
        }
        return sb.toString();
    }
}
