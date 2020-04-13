package com.soft1851.springboot.aop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tao
 * @version 1.0
 * @ClassName HelloTestController
 * @Description 提供hello方法作为待测试的业务接口
 * @date 2020-04-09 21:53
 **/
@RestController
public class HelloTestController {
    @RequestMapping(value = "/hello")
    public String hello(String name){
        return "Hello " +name;
    }
}
