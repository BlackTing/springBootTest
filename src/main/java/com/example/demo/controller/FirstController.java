package com.example.demo.controller;

import com.example.demo.entity.UserParams;
import com.example.demo.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @Autowired
    FirstService firstService;

    @RequestMapping(method = RequestMethod.POST,value = "/first")
    public String createAccount(@RequestBody UserParams userParams){
        return firstService.createAccount(userParams);
    }
}
