package com.itaz.niuke.service;

import com.itaz.niuke.dao.DiscussPostMapper;
import com.itaz.niuke.entity.DiscussPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ author: itaz
 * @ date: 2022/2/27
 * @ profile:
 */
@Service
public class DiscussPostService {
    @Autowired
    private DiscussPostMapper discussPostMapper;

    public List<DiscussPost> findDiscussPosts(int userId,int offset,int limit){
        return discussPostMapper.selectDiscussPosts(userId,offset,limit);
    }

    public int findDiscussRows(int userId){
        return discussPostMapper.selectDiscussPostRows(userId);
    }
}
