package com.jk.service.impl;

import com.jk.dao.MenuMapper;
import com.jk.model.Menu;
import com.jk.service.IMenuService;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/11/14.
 */
@Service
public class MenuServiceImpl implements IMenuService {

    @Autowired
    private MenuMapper menuMapper;

   /* public String selAllMenu(){
        List<Menu> list = menuMapper.queryMenuList();
        return JSONArray.fromObject(list).toString();
    }*/
    public List<Menu> selAllMenu(){
        List<Menu> list = this.queryChildren("0");
        return list;
    }

    public List<Menu> queryChildren(String id){
        List<Menu> trees = menuMapper.queryMenuList(id);
        if(trees!=null&&trees.size()>0){
            for (int i=0;i<trees.size();i++){
                List<Menu> tree2 = queryChildren(trees.get(i).getId().toString());
                trees.get(i).setNodes(tree2);
            }
        }
        return trees;
    }
}
