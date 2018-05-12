package com.xue.rose.controllers;

import com.xue.rose.jdbcbean.Test;
import com.xue.rose.service.TestService;
import net.paoding.rose.web.annotation.Param;
import net.paoding.rose.web.annotation.Path;
import net.paoding.rose.web.annotation.rest.Get;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

@Path("/jdbc/")
public class JdbcController {
    @Autowired
    TestService testService;

    @Get("demo1")
    public Test index3() throws Exception {

        return testService.demo1();
    }
    @Get("demo2")
    public List<Test> index4(Test test) throws Exception {

        return testService.getTestById(test);
    }
    @Get("demo3")
    public String index22222(Test test) throws Exception {

        return "@"+testService.insertTest(test);
    }

    @Get("demo4")
    public String index2222asd2(@Param("id") int id) throws Exception {
        return "@"+testService.getTestsById2(id).toString();
    }
}
