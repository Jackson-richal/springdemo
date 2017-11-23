package com.jk.dao;

import com.jk.model.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2017/11/14.
 */
@Mapper
public interface MenuMapper {

    @Select("select * from t_tree where pid=#{id}")
    public List<Menu> queryMenuList(@Param("id") String id);

    /*@Select("select * from t_tree")
    public List<Menu> queryMenuList();*/
}
