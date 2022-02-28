package com.itaz.niuke.entity;

import lombok.Data;

import java.util.Date;

/**
 * @ author: itaz
 * @ date: 2022/2/27
 * @ profile:
 */
@Data
public class User {
    private int id;
    private String userName;
    private String password;
    private String salt;
    private int type;
    private int status;
    private String activationCode;
    private String headerUrl;
    private Date createTime;
}
