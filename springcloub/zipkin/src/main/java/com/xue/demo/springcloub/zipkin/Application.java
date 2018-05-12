package com.xue.demo.springcloub.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
//开启ZipkinServer的功能
@EnableZipkinServer
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}