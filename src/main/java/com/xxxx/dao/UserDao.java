package com.xxxx.dao;

import com.xxxx.domian.User;

import java.util.List;

public interface UserDao {
     /*查询*/
     List<User> selectUser();
     /*注册*/
     int insertUser(User user);
}
