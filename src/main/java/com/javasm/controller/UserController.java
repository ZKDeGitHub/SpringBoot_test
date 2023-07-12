package com.javasm.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.javasm.entity.User;
import com.javasm.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: zk
 * @since: 11
 * @Date 2023/7/11 23:22
 * @description:
 */

@RestController
@RequestMapping("user")
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping("add")
    public String add(@RequestBody User user) {
        System.out.println(user);
        userService.addUser(user);
        return "add成功";
    }

    @PostMapping("edit")
    public String update(@RequestBody User user) {
        System.out.println(user);
        userService.editUser(user);
        return "修改成功了";
    }

    @GetMapping("remove")
    public String remove(int id) {
        userService.removeUser(id);
        return "删除成功了";
    }

    @GetMapping("query")
    public String query(int id) {
        User user = userService.queryById(id);
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonStr = null;
        try {
//            对象转换为 字符串的方法
            jsonStr = objectMapper.writeValueAsString(user);
//            字符串转行为对象的方法
//            User user1 = objectMapper.readValue(jsonStr, User.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return jsonStr;
    }


    @GetMapping("/queryAll/{pageNum}/{pageSize}")
    public String queryAll(@PathVariable  int pageNum, @PathVariable int pageSize) throws JsonProcessingException {
        List<User> users = userService.queryAll(pageNum, pageSize);
        ObjectMapper objectMapper = new ObjectMapper();
        String userListStr = objectMapper.writeValueAsString(users);
        return userListStr;
    }
}
