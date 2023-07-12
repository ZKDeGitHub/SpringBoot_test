package com.javasm.service;

import com.javasm.entity.User;

import java.util.List;

/**
 * @Author: zk
 * @since: 11
 * @Date 2023/7/12 11:22
 * @description:
 */

public interface UserService {
    int addUser(User user);

    int editUser(User user);

    int removeUser(int id);

    User queryById(int id);

    List<User> queryAll(int pageNum, int pageSize);

}