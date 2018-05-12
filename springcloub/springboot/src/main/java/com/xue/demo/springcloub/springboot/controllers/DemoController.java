package com.xue.demo.springcloub.springboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/demo/")
public class DemoController {
    /**
     * 测试1
     * @return
     */
    @GetMapping("/demo1")
    public Map<String,Object> runReportJob(){
        Map<String,Object> returnMap = new HashMap<String,Object>();

        returnMap.put("name","xue熊");
        returnMap.put("age",123);

        return returnMap;
    }



}
