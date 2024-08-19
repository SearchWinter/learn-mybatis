package com.upchina.entity;

/**
 * Created by anjunli on  2024/8/16
 * 对应Mysql表，类的属性名称要和表字段名称一致，输出结果才有值
 **/
public class User {
    private String uid;
    private String name;

    public User() {
    }

    public User(String uid, String name) {
        this.uid = uid;
        this.name = name;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid='" + uid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
