package com.javasm.service.impl;

import com.github.pagehelper.PageHelper;
import com.javasm.entity.User;
import com.javasm.mapper.UserMapper;
import com.javasm.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: zk
 * @since: 11
 * @Date 2023/7/12 11:22
 * @description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public int addUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public int editUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public int removeUser(int id) {
        return userMapper.deleteUser(id);
    }

    @Override
    public User queryById(int id) {
        return userMapper.selectUser(id);
    }

    @Override
    public List<User> queryAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return userMapper.selectAll();
    }

}
