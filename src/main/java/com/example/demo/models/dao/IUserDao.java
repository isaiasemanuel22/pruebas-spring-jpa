package com.example.demo.models.dao;

import com.example.demo.models.entity.User;

import java.util.List;

public interface IUserDao {

    public List<User> findAll();
}
