package com.hyt.AAbooks.controller;

import com.hyt.AAbooks.domain.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @Autowired
    ConfigBean configBean;
    @RequestMapping("/hello")
    public String index() {
        return "账号"+configBean.getName()+"+/密码:"+configBean.getPwd();
    }
}