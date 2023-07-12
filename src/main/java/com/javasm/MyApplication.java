package com.javasm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author zk
 * @Date 2023/7/11 10:22
 * @注释：springboot启动类
 * @SpringBootApplication 包含@ComponentScan，因此
 * 配置Application启动类的位置要与业务类的包同级，这也才能提供包扫描
 */
@SpringBootApplication
//设置mapper层的包扫描
@MapperScan("com.javasm.mapper")
//开启事务
@EnableTransactionManagement
public class MyApplication {
    public static void main(String[] args) {
        //也可以是两个参数，第一个参数为启动的类名，第二个为args
        //返回的值就是是springIOC容器
        ConfigurableApplicationContext context = SpringApplication.run(MyApplication.class,args);
    }

}
