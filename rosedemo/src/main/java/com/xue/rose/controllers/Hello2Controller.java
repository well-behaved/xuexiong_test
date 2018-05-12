/**
 * @author 54chen(陈臻) [chenzhen@xiaomi.com czhttp@gmail.com]
 * @since 2012-4-10 上午11:14:46
 */
package com.xue.rose.controllers;

import com.xue.rose.annotation.NotBlank;
import com.xue.rose.bean.DemoBean;
import net.paoding.rose.web.annotation.Param;
import net.paoding.rose.web.annotation.Path;
import net.paoding.rose.web.annotation.rest.Get;

import java.util.Map;

@Path("/hello/")
public class Hello2Controller {
    @Get("mapDemo")
    public String index3( @Param("mapDemo")Map<String,String> mapDemo) throws Exception {
        return "@hello world------"+mapDemo.get("name");
    }

    @Get("world3")
    public String index34(DemoBean demoBean) throws Exception {
        return "@hello world------"+demoBean;
    }
    @Get("notBlank")
    public String index5(@NotBlank @Param("notBlank")  String notBlank) throws Exception {
        return "@hello world-----notBlank-";
    }

    @Get("world2")
    public String index2() throws Exception {
        int[] demo2 = new int[2];
        demo2[23] = 1;
        return "@hello world";
    }
    @Get("world")
    public String inde() throws Exception {
        return "@hello world";
    }
}