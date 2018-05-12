package com.xue.demo.rabbitmq;

import com.rabbitmq.client.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.util.TreeSet;

/**
 * @Author 薛雄
 * @Date 2018/5/11 15:09
 */
@RunWith(SpringJUnit4ClassRunner.class) // SpringJUnit支持，由此引入Spring-Test框架支持！
//@SpringApplicationConfiguration(classes = SpringBootSampleApplication.class) // 指定我们SpringBoot工程的Application启动类
//@WebAppConfiguration // 由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
public class HelloWordTest {
    @Test
    public void demo(){
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(6);

        treeSet.headSet(3).clear();

        for (Integer string : treeSet){
            System.out.print(string+"--");
        }
    }

}
