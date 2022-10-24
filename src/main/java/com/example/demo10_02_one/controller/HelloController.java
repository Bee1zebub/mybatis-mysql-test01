package com.example.demo10_02_one.controller;


import com.example.demo10_02_one.bean.User;
import com.example.demo10_02_one.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import java.util.List;

@Slf4j
@RestController
public class HelloController {

    @Autowired
    private IUserService userService;



    @GetMapping(value = "/hello")
    public List<User> hello(){
        return userService.queryAll();
    }
}
