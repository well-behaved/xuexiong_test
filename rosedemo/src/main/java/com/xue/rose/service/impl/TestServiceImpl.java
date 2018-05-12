package com.xue.rose.service.impl;

import com.xue.rose.dao.TestDAO;
import com.xue.rose.jdbcbean.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TestServiceImpl implements com.xue.rose.service.TestService {

    @Autowired
    private TestDAO testDAO;

    @Override
    public Test getTest() {
        return testDAO.getTest();
    }

    @Override
    public Test demo1() {
        return testDAO.getTest();
    }

    @Override
    public List<Test> getTestById(Test test) {
        return testDAO.getTestById(test);
    }

    @Override
    public int insertTest(Test test) {
        return testDAO.insertTest(test);
    }

    @Override
    public List<Test> getTestsById2(int id) {
        return testDAO.getTestsById2(id);
    }
}