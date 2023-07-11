package com.javasm.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zk
 * @since: 11
 * @Date 2023/7/11 23:22
 * @description: 测试跨域用
 */

@RestController
//跨域解决方案一（局部解决）：在controller类上添加注解
//allowCredentials = "true" 表示允许携带cookie
//@CrossOrigin(allowCredentials = "true")
public class UserController {

    @PostMapping("login")
    public String login(String userName,String userPwd){
        System.out.println("用户名：" + userName);
        System.out.println("用户密码：" + userPwd);
        return "success";

    }
}
