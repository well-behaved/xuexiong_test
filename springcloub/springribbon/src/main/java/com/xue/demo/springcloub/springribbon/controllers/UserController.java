package com.xue.demo.springcloub.springribbon.controllers;

import com.xue.demo.springcloub.springribbon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user/")
public class UserController {
    @Autowired
    UserService userService;
    @Value("${server.port}")
    String port;
    @GetMapping("getUser")
    public Map<String,Object> clientDemo(String name){
        Map<String,Object> returnMap = new HashMap<>();
        returnMap.put("返回信息",name+"----被发现了---"+userService.hiService(name));
        return returnMap;
    }
}
