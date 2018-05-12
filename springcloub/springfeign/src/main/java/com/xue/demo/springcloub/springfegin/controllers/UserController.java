package com.xue.demo.springcloub.springfegin.controllers;

import com.xue.demo.springcloub.springfegin.service.fegin.FigenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    FigenService figenService;
    @GetMapping("getUser")
    public Map<String,Object> clientDemo(String name){
        Map<String,Object> returnMap = new HashMap<>();
        returnMap.put("msg",figenService.sayHiFromClientOne(name));
        return  returnMap;
    }

}
