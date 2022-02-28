package com.itaz.niuke.test;

import com.itaz.niuke.NiukeApplication;
import com.itaz.niuke.dao.DiscussPostMapper;
import com.itaz.niuke.dao.UserMapper;
import com.itaz.niuke.entity.DiscussPost;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

/**
 * @ author: itaz
 * @ date: 2022/2/27
 * @ profile:
 */
@SpringBootTest
@ContextConfiguration(classes = NiukeApplication.class)
public class MapperTest {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private DiscussPostMapper discussMapper;
    @Test
    public void selectUser(){
        System.out.println(userMapper.selectUserById(101));
    }
    @Test
    public void setDiscussPostMapper(){
        List<DiscussPost> discussPosts = discussMapper.selectDiscussPosts(0, 0, 10);
        for (DiscussPost post : discussPosts){
            System.out.println(post);
        }
    }
    @Test
    public void selectRows(){
        System.out.println(discussMapper.selectDiscussPostRows(0));
    }

}
