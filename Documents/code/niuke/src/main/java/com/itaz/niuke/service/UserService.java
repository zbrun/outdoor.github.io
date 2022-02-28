package com.itaz.niuke.service;

import com.itaz.niuke.dao.UserMapper;
import com.itaz.niuke.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ author: itaz
 * @ date: 2022/2/27
 * @ profile:
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User findUserById(int id){
        return userMapper.selectUserById(id);
    }
}
