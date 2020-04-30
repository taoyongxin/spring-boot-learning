package com.soft1851.oauth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tao
 * @version 1.0
 * @ClassName TestController
 * @Description TODO
 * @date 2020-04-29 11:06
 **/
@RestController
public class TestController {
    @RequestMapping("/index")
    public String simpleIndex(){
        return "index";
    }
}
