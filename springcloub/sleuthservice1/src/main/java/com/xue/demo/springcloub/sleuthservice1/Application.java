package com.xue.demo.springcloub.sleuthservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//向服务中心注册
@EnableDiscoveryClient
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    @Bean
//    开启负载均衡的功能
    @LoadBalanced
    RestTemplate restTemplate() {
        //通过restTemplate来调用服务
        return new RestTemplate();
    }
}