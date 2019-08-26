package com.wwl.wwl.service;

import com.wwl.wwl.model.User;

import java.util.List;

public interface UserService {
    public void insert(String username,String password);

    public void delete(String username);

    public void update(String password,String username);

    List<User> select(String username);
}
