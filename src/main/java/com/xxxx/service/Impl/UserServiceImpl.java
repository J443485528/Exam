package com.xxxx.service.Impl;

import com.xxxx.dao.UserDao;
import com.xxxx.domian.User;
import com.xxxx.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    @Override
    public List<User> selectUser() {
        List<User> user = userDao.selectUser();
        return user;
    }

    @Override
    public int addUser(User user) {
        int n = userDao.insertUser(user);
        return n;
    }
}
