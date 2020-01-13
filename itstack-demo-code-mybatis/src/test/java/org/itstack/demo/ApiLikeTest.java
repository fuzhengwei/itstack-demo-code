package org.itstack.demo;

import com.alibaba.fastjson.JSON;
import org.itstack.demo.like.Resources;
import org.itstack.demo.like.SqlSession;
import org.itstack.demo.like.SqlSessionFactory;
import org.itstack.demo.like.SqlSessionFactoryBuilder;
import org.itstack.demo.po.User;
import org.junit.Test;

import java.io.Reader;
import java.util.List;

/**
 * 公众号 | bugstack虫洞栈
 * 博 客 | https://bugstack.cn
 * Create by 小傅哥 @2020
 */
public class ApiLikeTest {

    @Test
    public void test_queryUserInfoById() {
        String resource = "spring/mybatis-config-datasource.xml";
        Reader reader;
        try {
            reader = Resources.getResourceAsReader(resource);
            SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);

            SqlSession session = sqlMapper.openSession();
            try {
                User user = session.selectOne("org.itstack.demo.dao.IUserDao.queryUserInfoById", 1L);
                System.out.println(JSON.toJSONString(user));
            } finally {
                session.close();
                reader.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test_queryUserList() {
        String resource = "spring/mybatis-config-datasource.xml";
        Reader reader;
        try {
            reader = Resources.getResourceAsReader(resource);
            SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);

            SqlSession session = sqlMapper.openSession();
            try {
                User req = new User();
                req.setAge(18);
                List<User> userList = session.selectList("org.itstack.demo.dao.IUserDao.queryUserList", req);
                System.out.println(JSON.toJSONString(userList));
            } finally {
                session.close();
                reader.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
