package com.upchina.dao;

import com.upchina.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 接口方法名称与Mapper里面select标签对应
 */
@Mapper
public interface UserDao {
    List<User> getUserList();

    User getUserById(int uid);

    User selectUserByIdAndUsername(@Param("uid") String uid, @Param("name") String name);

    void addUser(User user);
}
