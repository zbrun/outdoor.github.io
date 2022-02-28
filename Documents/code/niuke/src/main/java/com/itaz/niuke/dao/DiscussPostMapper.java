package com.itaz.niuke.dao;

import com.itaz.niuke.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ author: itaz
 * @ date: 2022/2/27
 * @ profile:
 */
@Mapper
public interface DiscussPostMapper {
    List<DiscussPost> selectDiscussPosts( int userId, int offset,int limit);
    //param 用于给参数取别名，如果只有一个参数，并且在if（动态sql）里使用，就必须加别名
    int selectDiscussPostRows(@Param("userId") int userId);

}
