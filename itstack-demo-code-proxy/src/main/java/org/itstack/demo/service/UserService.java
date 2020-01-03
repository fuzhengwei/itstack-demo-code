package org.itstack.demo.service;

import org.itstack.demo.service.IUserService;

/**
 * 微信公众号：bugstack虫洞栈 | 欢迎关注学习专题案例
 * 论坛：http://bugstack.cn
 * Create by 付政委 on @2019
 */
public class UserService implements IUserService {

    public String queryUserNameById(String userId) {
        return "hi user " + userId;
    }

}
