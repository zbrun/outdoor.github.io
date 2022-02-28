package com.itaz.niuke.entity;

import lombok.Data;

import java.util.Date;

/**
 * @ author: itaz
 * @ date: 2022/2/27
 * @ profile:
 */
@Data
public class DiscussPost {
    private int id;
    private int userId;
    private String title;
    private String content;
    private int type;
    private int status;
    private Date createTime;
    private double score;
}
