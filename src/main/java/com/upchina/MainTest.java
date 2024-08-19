package com.upchina;

import com.upchina.dao.UserDao;
import com.upchina.entity.User;
import com.upchina.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by anjunli on  2024/8/16
 **/
public class MainTest {
    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);

/*        List<User> userList = userDao.getUserList();
        for (User user : userList) {
            System.out.println("user = " + user);
        }*/

/*        User userByUid = userDao.getUserById(18);
        System.out.println("userByUid = " + userByUid);*/

        User uid_1 = userDao.selectUserByIdAndUsername("18", "uid_1");
        System.out.println("selectUserByIdAndName = " + uid_1);

        sqlSession.close();
    }

    @org.junit.Test
    public void addUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        userDao.addUser(new User("uid_1001", "test"));
        //注意，增，删，改操作需要提交事务，不写的话不会提交到数据库
        sqlSession.commit();
        sqlSession.close();
    }
}
