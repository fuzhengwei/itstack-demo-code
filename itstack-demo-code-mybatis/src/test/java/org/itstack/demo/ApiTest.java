package org.itstack.demo;

import org.itstack.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.sql.SQLOutput;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class ApiTest {

    @Resource
    private UserService userService;

    @Test
    public void test_queryUserInfo() {
        userService.queryUserInfo();
    }


    @Test
    public void test_long() {
        int i = Integer.MAX_VALUE / 8 / 8;
        System.out.println(i);
        long[][] xx = new long[i][i];
        xx[i - 1][i - 1] = 1;
        System.out.println(xx[i - 1][i - 1]);
    }

}
