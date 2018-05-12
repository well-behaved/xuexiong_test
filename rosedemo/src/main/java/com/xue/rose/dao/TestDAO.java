package com.xue.rose.dao;

import com.xue.rose.jdbcbean.Test;
import net.paoding.rose.jade.annotation.*;

import java.util.List;

@DAO
public interface TestDAO {
    @SQL("select id,msg from test limit 1")
    Test getTest();

    @SQL("select id,msg from test where id = :t.id")
    List<Test> getTestById(@SQLParam("t") Test test);

    @ReturnGeneratedKeys
    @SQL("insert into test (id,msg) values (:t.id,:t.msg)")
    int insertTest(@SQLParam("t") Test test);

   /* 分表测试*/
   @SQL("SELECT id,msg FROM test ")
   public List<Test> getTestsById2(@ShardBy @SQLParam("id") int id);

}