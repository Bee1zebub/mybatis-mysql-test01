package com.example.demo10_02_one.service.impl;

import com.example.demo10_02_one.bean.User;
import com.example.demo10_02_one.dao.IUserDao;
import com.example.demo10_02_one.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;


    @Override
    public List<User> queryAll() {
        return userDao.queryAll();
    }
}
