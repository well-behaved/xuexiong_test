package com.xue.demo.springcloub.sleuthservice2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user/")
public class DemoController {
    @Autowired
    RestTemplate restTemplate;
    @Value("${server.port}")
    String port;
    @GetMapping("getUser")
    public Map<String,Object> clientDemo(String name){
        Map<String,Object> returnMap = new HashMap<>();
//        String returnStirng  =  restTemplate.getForObject("http:/sleuth-service1/user/getUser?name="+name,String.class);
        returnMap.put("returnMap",name+"--------"+port);
        return returnMap;
    }
}
