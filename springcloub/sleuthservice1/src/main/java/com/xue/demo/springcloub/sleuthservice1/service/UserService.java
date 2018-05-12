package com.xue.demo.springcloub.sleuthservice1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://client-demo01/demo/demo1?name="+name,String.class);
    }
    public String hiService2(String name) {
        return restTemplate.getForObject("http://sleuth-service2/user/getUser?name="+name,String.class);
    }
}
