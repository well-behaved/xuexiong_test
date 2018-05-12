package com.xue.demo.springcloub.springfegin.service.fegin.fallback;

import com.xue.demo.springcloub.springfegin.service.fegin.FigenService;
import org.springframework.stereotype.Component;

@Component
/**
 * 熔断类
 */
public class FigenServiceFB implements FigenService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "fallback错误"+name;
    }
}
