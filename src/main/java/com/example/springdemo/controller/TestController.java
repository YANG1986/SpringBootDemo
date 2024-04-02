package com.example.springdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author neocheng
 * @Date 2021-03-17 00:12
 * @Version 1.0
 **/
@RestController
public class TestController {

    @RequestMapping("/test")
    public void test() {
        Map<Object, Object> data = new HashMap();
        data.put("params1" , 1);
        data.put("params3" , 2);
        return ;
    }
}
