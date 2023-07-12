package com.javasm.controller;


import com.javasm.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

/**
 * @Author: zk
 * @since: 11
 * @Date 2023/7/12 15:39
 * @description:
 */
@SpringBootTest
public class UserControllerTest {

    @Resource
    private UserController userController;

    @Test
    public void add() {
        userController.add(new User(1024,"用户名1", LocalDateTime.now(),"男","郑州"));
    }
}