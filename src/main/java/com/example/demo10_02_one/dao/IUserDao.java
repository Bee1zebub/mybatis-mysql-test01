package com.example.demo10_02_one.dao;

import com.example.demo10_02_one.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface IUserDao {
    //@Select("select * from tb1_user")
    List<User> queryAll();



}
