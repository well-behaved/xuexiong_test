package com.xue.demo.springcloub.sleuthservice1.controllers;

import com.xue.demo.springcloub.sleuthservice1.service.UserService;
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
    @Autowired
    UserService userService;
    @Value("${server.port}")
    String port;
    @GetMapping("getUser")
    public Map<String,Object> clientDemo(String name){
        Map<String,Object> returnMap = new HashMap<>();
        String returnStirng  =  userService.hiService2(name);
        returnMap.put("returnMap",returnStirng);
        return returnMap;
    }
    @GetMapping("getUser2")
    public Map<String,Object> clientDemo2(String name){
        Map<String,Object> returnMap = new HashMap<>();
//        String returnStirng  =  restTemplate.getForObject("http:/client-demo1/demo/demo1/name="+name,String.class);
        String returnStirng  =  userService.hiService(name);
        returnMap.put("returnMap",returnStirng);
        return returnMap;
    }
}
