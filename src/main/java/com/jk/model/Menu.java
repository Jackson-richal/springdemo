package com.jk.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2017/11/14.
 */
public class Menu implements Serializable{

    private static final long serialVersionUID = 3797829027174376926L;

    private Integer id;
    private String text;
    private String url;
    private String pid;
    private List<Menu> nodes;

    public List<Menu> getNodes() {
        return nodes;
    }

    public void setNodes(List<Menu> nodes) {
        this.nodes = nodes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Menu menu = (Menu) o;

        return id.equals(menu.id);

    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", url='" + url + '\'' +
                ", pid='" + pid + '\'' +
                ", nodes=" + nodes +
                '}';
    }
}
