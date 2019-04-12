package com.king.condict.controller;

import com.king.condict.dao.UserDao;
import com.king.condict.entry.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: guoning
 * @Description: // TODO
 * @Date: 2019/4/12 16:41
 * @Version: 1.0
 */
@RestController
public class Demo {
    @RequestMapping("/test")
    public String Test(){
        User user = new User();
        user.setName("king");
        user.setTitle("Test");
        //userDao.insert(user);
        return "success";
    }
}
