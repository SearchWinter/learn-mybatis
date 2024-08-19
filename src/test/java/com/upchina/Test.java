package com.upchina;

import com.upchina.dao.UserDao;
import com.upchina.entity.User;

import java.util.List;

/**
 * Created by anjunli on  2024/8/16
 **/
public class Test {
    @org.junit.Test
    public void InterfaceImpl() {
//        UserDao userDao = new UserDao();

        //new接口
        //不是为了创建接口的实例 接口没有实例的说法
        //是创建一个接口的实现类,并实现功能,相当于创建一个 "接口Impl"
/*        UserDao userDao1 = new UserDao() {
            @Override
            public List<User> getUserList() {
                return null;
            }
        };*/
    }
}
