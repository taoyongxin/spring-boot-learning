package com.soft1851.springboot.aop.service;

import com.soft1851.springboot.aop.SpringBootAopApplication;
import com.soft1851.springboot.aop.common.Result;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest(classes = SpringBootAopApplication.class)
class SysUserServiceTest {

    @Resource
    private SysUserService sysUserService;
    @Test
    void getSysUserByUserId() {
        Result result = sysUserService.getSysUserByUserId(1);
        System.out.println(result);
    }

    @Test
    void getSysUserByAll() {
        Result result = sysUserService.getSysUserByAll(1);
        System.out.println(result);
    }
}