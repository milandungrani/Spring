package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.User;

public interface UserDao {
    
    int insertUser(User user);

    List<User> selectAllUser();
}