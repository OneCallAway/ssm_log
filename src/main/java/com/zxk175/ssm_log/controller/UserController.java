package com.zxk175.ssm_log.controller;

import com.zxk175.ssm_log.dto.BaseResult;
import com.zxk175.ssm_log.pojo.User;
import com.zxk175.ssm_log.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zxk175 on 16/12/8.
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    private BaseResult baseResult;

    /**
     * 用户登录
     *
     * @param username
     * @param password
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public BaseResult login(String username, String password) {
        baseResult = new BaseResult();
        baseResult.setCode(BaseResult.OK);
        baseResult.setMsg(BaseResult.OK_STR);

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        user = userService.login(user);
        if (null == user) {
            baseResult.setCode(BaseResult.FAILED);
            baseResult.setMsg(BaseResult.FAILED_STR);
        }

        return baseResult;
    }
}
