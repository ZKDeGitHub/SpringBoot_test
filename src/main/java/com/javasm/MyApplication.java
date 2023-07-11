package com.javasm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author zk
 * @Date 2023/7/11 10:22
 * @注释：springboot启动类
 * 注意配置类的位置要与业务类的包同级，这也才能提供包扫描
 */
@SpringBootApplication
public class MyApplication {
    public static void main(String[] args) {
        //也可以是两个参数，第一个参数为启动的类名，第二个为args
        SpringApplication.run(MyApplication.class);
    }

}
