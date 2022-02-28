package com.itaz.niuke.controller;

import com.itaz.niuke.entity.DiscussPost;
import com.itaz.niuke.entity.Page;
import com.itaz.niuke.entity.User;
import com.itaz.niuke.service.DiscussPostService;
import com.itaz.niuke.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ author: itaz
 * @ date: 2022/2/27
 * @ profile:
 */
@Controller
public class HomeController {
    @Autowired
    private DiscussPostService discussPostService;
    @Autowired
    private UserService userService;

    @RequestMapping(path = "/comments",method = RequestMethod.GET)
    public String getIndexPage(Model model, Page page) {
        //方法调用之前，会自动实例话model，page，并将page自动注入model，则thymeleaf可以直接访问page对象
        page.setRows(discussPostService.findDiscussRows(0));
        page.setPath("/comments");
        List<DiscussPost> list = discussPostService.findDiscussPosts(0, page.getOffset(), page.getLimit());

        List<Map<String, Object>> discussPosts = new ArrayList<>();
        if (list != null) {
            for (DiscussPost post : list) {
                Map<String, Object> map = new HashMap<>();
                map.put("post", post);
                User user = userService.findUserById(post.getUserId());
                map.put("user", user);
                discussPosts.add(map);
            }
        }
        model.addAttribute("discussPosts", discussPosts);
        return "comments";
    }


}
