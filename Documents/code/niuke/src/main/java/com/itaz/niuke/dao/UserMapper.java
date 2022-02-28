package com.itaz.niuke.dao;


import com.itaz.niuke.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ author: itaz
 * @ date: 2022/2/27
 * @ profile:
 */
@Mapper
public interface UserMapper {
    User selectUserById(int id);

    User selectUserByName(String name);

    User selectUserByEmail(String email);

    int insertUser(User user);

    int updateStatus(int id,int status);

    int updateHeader(int id,String url);

    int updatePassowrd(int id,String password);
}
