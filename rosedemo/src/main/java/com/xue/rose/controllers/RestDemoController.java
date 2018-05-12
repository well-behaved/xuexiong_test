package com.xue.rose.controllers;

import net.paoding.rose.web.annotation.Param;
import net.paoding.rose.web.annotation.Path;
import net.paoding.rose.web.annotation.rest.Get;

@Path({"demo","demo2"})
public class RestDemoController {
    @Get({"get1","get2"})
    public String demo22(){
        System.out.print("demo22");
        return "@demo2222222222-----------------------";
    }
    @Get({"get1","get2"})
    public String demo(){
        System.out.print("demo");
        return "@demo-----------------------";
    }


    /**
     * restful测试
     * @return
     */
    @Get({"get1/{name:[xyz]+}"})
    public String demo(@Param("name") String name){
        return "@demo-----------------------"+name;
    }

}
