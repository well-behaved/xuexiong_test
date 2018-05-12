package com.xue.demo.springcloub.configserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * The type Application.
 *
 * @author :<a href="mailto:xiong.xue@renren-inc.com">xiong.xue</a>
 * @date :2018-05-10 19:59:16
 */
@SpringBootApplication
@RequestMapping("/demo/")
public class Application {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @author :<a href="mailto:xiong.xue@renren-inc.com">xiong.xue</a>
     * @date :2018-05-10 19:59:16
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}