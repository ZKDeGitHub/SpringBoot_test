package com.javasm.controller;

import com.javasm.entity.Student;
import org.springframework.web.bind.annotation.*;

/**
 * @Author zk
 * @Date 2023/7/11 10:22
 * @注释： 测试springboot连接，跨域请求测试
 *
 */
//跨域解决方案一（局部解决）：在controller类上添加注解
//allowCredentials = "true" 表示允许携带cookie
//@CrossOrigin(allowCredentials = "true")
@RestController
public class TestController {

    @PostMapping("login")
    public String login(String userName,String userPwd) {
        System.out.println("用户名：" + userName);
        System.out.println("用户密码：" + userPwd);
        return "success";
    }

    @PostMapping("add")
    public String addStudent(@RequestBody Student student){
        System.out.println(student);
        return "add成功";
    }

    @GetMapping("hello")
    public String method(){
        System.out.println("method执行了");
        return "Hello SpringBoot";
    }
}
