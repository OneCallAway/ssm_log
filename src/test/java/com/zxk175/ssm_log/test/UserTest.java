package com.zxk175.ssm_log.test;

import com.zxk175.ssm_log.dao.UserMapper;
import com.zxk175.ssm_log.pojo.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by zxk175 on 16/12/8.
 */

//spring的单元测试
@RunWith(SpringJUnit4ClassRunner.class)
//上下文配置
@ContextConfiguration({"classpath:spring/spring-*.xml"})
public class UserTest {
    private Logger logger = LogManager.getLogger(UserTest.class);

    @Autowired(required = false)
    private UserMapper userDao;

    /**
     * 添加用户的Dao单元测试
     */
    @Test
    public void testDaoAdd() {
        User user = new User();
        user.setUsername("Hello");
        user.setPassword("123456");
        user.setSalt("56464685");
        int result = 0;
        try {
            result = userDao.insertSelective(user);
        } catch (Exception e) {
            logger.debug("添加用户失败");
            e.printStackTrace();
        }
        if (result > 0)
            logger.debug("添加用户成功");
    }

    /**
     * 用户登录的Dao单元测试
     *
     * @throws Exception
     */
    @Test
    public void testDaoLogin() {
        User user = new User();
        user.setUsername("Hello");
        user.setPassword("123456");
        try {
            user = userDao.login(user);
        } catch (Exception e) {
            logger.debug("用户登录失败");
            e.printStackTrace();
        }
        if (user != null)
            logger.debug("用户登录成功");
    }
}