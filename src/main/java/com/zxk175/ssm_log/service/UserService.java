package com.zxk175.ssm_log.service;

import com.zxk175.ssm_log.pojo.User;
import com.zxk175.ssm_log.pojo.UserExample;

import java.util.List;

/**
 * Created by zxk175 on 16/12/8.
 */
public interface UserService {
    boolean add(User user) throws Exception;

    User login(User user);

    List<User> findByExample(UserExample example);
}
