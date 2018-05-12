/**
 * @author 54chen(陈臻) [chenzhen@xiaomi.com czhttp@gmail.com]
 * @since 2012-4-10 上午11:14:46
 */
package com.xue.rose.controllers;

import com.xue.rose.common.FilterDemo;
import net.paoding.rose.web.annotation.Param;
import net.paoding.rose.web.annotation.Path;
import net.paoding.rose.web.annotation.rest.Delete;
import net.paoding.rose.web.annotation.rest.Get;
import net.paoding.rose.web.var.Model;

@Path("/hello/")

public class HelloController {

    @Get("demo555")
    @FilterDemo
    public String demo11111111s(@Param("name")String name) {
        System.out.println("--------方法正在111111111111运行------");
        return "@json:"+name;
    }


    @Get("demo1")
    @FilterDemo
    public String demo11111111111(@Param("name")String name) {
        System.out.println("--------方法正在111111111111运行------");
        return "@hello world"+name;
    }
    @Get("demo2")
    public String demo11111111221(@Param("name")String name) {
        System.out.println("--------方法正在22222222222运行------");
        return "@hello world"+name;
    }
    @Get("demo3")
    public String demo11111111331(@Param("name")String name) {
        System.out.println("--------方法正在3333333333运行------");
        return "@hello world"+name;
    }


    @Get("world/{name:[xyz]+}")
    public String index(@Param("name")String name) {
        System.out.println("--------方法正在运行------");
        return "@hello world"+name;
    }
    @Get("demo")
    public String demo(Model model) {
        model.add("name","薛雄");
        model.add("age",12);
        return "demo.jsp";
    }
    @Get("demo2")
    public String demo2(Model model) {
        model.add("name","薛雄");
        model.add("age",12);
        return "a:/world";
    }
    @Get("demo3")
    public String demo3(Model model) {
        model.add("name","薛雄");
        model.add("age",12);
        return "a:hello/world";
    }
    @Delete

    public String demo4(Model model) {
        model.add("name","薛雄");
        model.add("age",12);
        return "a:hello/world";
    }
}
