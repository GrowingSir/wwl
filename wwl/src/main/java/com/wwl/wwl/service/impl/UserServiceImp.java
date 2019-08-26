package com.wwl.wwl.service.impl;

import com.wwl.wwl.mapper.UserMapper;
import com.wwl.wwl.model.User;
import com.wwl.wwl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImp  implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void insert(String username, String password) {
        userMapper.insert(username, password);
    }

    @Override
    public void delete(String username) {
        userMapper.delete(username);
    }

    @Override
    public void update(String password, String username) {
        userMapper.update(password,username);
    }

    @Override
    public List<User> select(String username) {
        return userMapper.select(username);
    }
}
