package com.zxk175.ssm_log.service.impl;

import com.zxk175.ssm_log.dao.UserMapper;
import com.zxk175.ssm_log.pojo.User;
import com.zxk175.ssm_log.pojo.UserExample;
import com.zxk175.ssm_log.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zxk175 on 16/12/8.
 */

@Service("userService")
public class UserServiceImpl implements UserService {
    private Logger logger = LogManager.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userDao;

    /**
     * 添加用户
     *
     * @param user
     * @return
     * @throws Exception
     */
    @Override
    public boolean add(User user) throws Exception {
        boolean flag = true;

        int result = userDao.insertSelective(user);

        if (result < 0) {
            flag = false;
        }
        return flag;
    }

    /**
     * 用户登录
     *
     * @param user
     * @return
     */

    @Override
    public User login(User user) {
        return userDao.login(user);
    }

    /**
     * 根据条件查找用户
     *
     * @param example
     */
    @Override
    public List<User> findByExample(UserExample example) {
        return userDao.selectByExample(example);
    }
}
