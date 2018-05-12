package com.xue.rose.service;

import com.xue.rose.jdbcbean.Test;
import net.paoding.rose.jade.annotation.SQLParam;
import net.paoding.rose.jade.annotation.ShardBy;

import java.util.List;

public interface TestService {
    public Test getTest();

    Test demo1();

    List<Test> getTestById(Test test);

    int insertTest(Test test);

    List<Test> getTestsById2(int id);

}
