package com.tyler.service;

import com.tyler.model.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * Created by tyler on 2016/12/21.
 * 继承SqlSessionDaoSupport
 * 调用SqlSessionDaoSupport类中的方法getSqlSession()
 * 代替了模板类
 */
public class UserServiceImpl extends SqlSessionDaoSupport implements UserService {
    public User selectUser(Integer id) {
        return getSqlSession().selectOne("com.tyler.dao.UserMapper.selectByPrimaryKey",id);
    }
}
