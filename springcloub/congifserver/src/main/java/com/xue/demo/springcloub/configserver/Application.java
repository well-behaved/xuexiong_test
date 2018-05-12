package com.xue.demo.springcloub.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.ConfigServerApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
//开启配置服务器的功能
@EnableConfigServer
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
