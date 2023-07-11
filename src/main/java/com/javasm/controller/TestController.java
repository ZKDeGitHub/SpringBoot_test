package com.javasm.controller;

import com.javasm.domain.Student;
import org.springframework.web.bind.annotation.*;

/**
 * @Author zk
 * @Date 2023/7/11 10:22
 * @注释：测试springboot连接
 */
@RestController
public class TestController {

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
