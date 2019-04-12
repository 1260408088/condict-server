package com.king.condict.controller;

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
        return "test";
    }
}
