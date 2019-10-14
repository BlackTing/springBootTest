package com.example.demo.service;

import com.example.demo.entity.UserParams;
import com.example.demo.mapper.FirstMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FirstService {

    @Autowired
    FirstMapper firstMapper;

    public String createAccount(UserParams userParams){
        String name = userParams.getName();
        firstMapper.createAccount(name);
        return "ok!";
    }
}
