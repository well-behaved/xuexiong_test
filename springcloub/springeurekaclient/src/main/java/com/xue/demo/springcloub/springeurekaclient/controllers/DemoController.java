package com.xue.demo.springcloub.springeurekaclient.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/demo/")
public class DemoController {
    @Value("${server.port}")
    String port;
    @GetMapping("demo1")
    public Map<String,Object> clientDemo(String name){
        Map<String,Object> returnMap = new HashMap<>();
        returnMap.put("msg",name+"----被发现了---"+port);
        return  returnMap;
    }
}
