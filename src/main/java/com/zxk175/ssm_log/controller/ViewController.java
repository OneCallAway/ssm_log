package com.zxk175.ssm_log.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zxk175 on 16/12/8.
 */

@Controller
public class ViewController {

    /**
     * 登陆页面
     *
     * @return
     */
    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    /**
     * 后台页面
     *
     * @return
     */
    @RequestMapping("/index")
    public String index() {
        return "tpl/index";
    }

    /**
     * 后台默认页面
     *
     * @return
     */
    @RequestMapping("/page/desktop")
    public String desktop() {
        return "tpl/page/desktop";
    }
}
