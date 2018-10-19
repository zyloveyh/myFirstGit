package com.zy.controller;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zy.dao.UserDao;
import com.zy.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

/**
 * project:  javaFour
 *
 * @author: zy
 * @date: 2018/10/18  20 : 12
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserDao userDao;


    @RequestMapping("/findAll")
    public List<User> findAll() throws JsonProcessingException {

        List<User> users = userDao.findAll();

        return users;
    }
}
