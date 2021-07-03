package com.xxxx.service;

import com.xxxx.domian.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
     /*登录查询*/
     List<User> selectUser();
     /*注册插入*/
     int addUser(User user);
}
