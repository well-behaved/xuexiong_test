package com.xue.demo.springcloub.configserver.Controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * The type Demo controller.
 *
 * @author :<a href="mailto:dongbiao.zheng@renren-inc.com">dongbiao.zheng</a>
 * @date :2018-05-10 19:55:16
 */
@RestController
@RequestMapping("/demo/")
public class DemoController {

    /**
     * The User name.
     *
     * @author :<a href="mailto:dongbiao.zheng@renren-inc.com">dongbiao.zheng</a>
     * @date :2018-05-10 19:55:17
     */
    @Value("${xuexiansheng}")
    private String userName;

    /**
     * Demo map.
     *
     * @return the map
     * @author :<a href="mailto:dongbiao.zheng@renren-inc.com">dongbiao.zheng</a>
     * @date :2018-05-10 19:55:17
     */
    @GetMapping("/demo1")

    public Map<String, Object> demo() {
        Map<String, Object> returnmap = new HashMap<>();
        returnmap.put("UserName", userName);
        return returnmap;
    }
}
