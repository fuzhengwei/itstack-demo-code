package org.itstack.demo.dao;

import org.itstack.demo.po.User;

public interface IUserDao {

     User queryUserInfoById(Long id);

}
