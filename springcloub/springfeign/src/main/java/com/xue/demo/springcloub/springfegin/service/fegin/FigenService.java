package com.xue.demo.springcloub.springfegin.service.fegin;


import com.xue.demo.springcloub.springfegin.service.fegin.fallback.FigenServiceFB;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 调用eureka接口
 */
@FeignClient(value = "client-demo1",fallback = FigenServiceFB.class)//熔断配置
public interface FigenService {
    @RequestMapping(value = "/demo/demo1", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
