package org.itstack.demo;

import com.alibaba.fastjson.JSON;
import org.itstack.demo.dao.ISchoolDao;
import org.itstack.demo.dao.IUserDao;
import org.itstack.demo.po.School;
import org.itstack.demo.po.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class SpringApiTest {

    private Logger logger = LoggerFactory.getLogger(SpringApiTest.class);

    @Resource
    private ISchoolDao schoolDao;
    @Resource
    private IUserDao userDao;

    @Test
    public void test_queryRuleTreeByTreeId(){
        School ruleTree = schoolDao.querySchoolInfoById(1L);
        logger.info(JSON.toJSONString(ruleTree));

        User user = userDao.queryUserInfoById(1L);
        logger.info(JSON.toJSONString(user));
    }

    @Test
    public void test(){
        B b = new B();
        b.scan();  //我的输出结果是什么？
    }

    static class A {
        public void scan(){
            doScan();
        }
        protected void doScan(){
            System.out.println("A.doScan");
        }
    }

    static class B extends A {
        @Override
        protected void doScan() {
            System.out.println("B.doScan");
        }
    }

}

