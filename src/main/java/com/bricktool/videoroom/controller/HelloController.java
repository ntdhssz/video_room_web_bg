package com.bricktool.videoroom.controller;

import com.bricktool.videoroom.service.database.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{
    @Autowired
    UserServiceImpl userService;

    @RequestMapping("/hello")
    public void hello() {

    }
}
