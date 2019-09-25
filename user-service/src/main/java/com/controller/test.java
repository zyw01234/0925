package com.controller;

import com.dao.UserDao;
import com.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class test {
    @Autowired
    private UserDao userDao;

    @GetMapping("/aa/{id}")
    @ResponseBody
    public User getUser(@PathVariable String id){

        return userDao.findUserById(id);
    }
}
