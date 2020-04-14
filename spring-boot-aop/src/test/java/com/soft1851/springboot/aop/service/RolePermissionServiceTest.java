package com.soft1851.springboot.aop.service;

import com.soft1851.springboot.aop.SpringBootAopApplication;
import com.soft1851.springboot.aop.common.Result;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = SpringBootAopApplication.class)
class RolePermissionServiceTest {

    private RolePermissionService rolePermissionService;
    @Test
    void getRolePermission() {
        Result result = rolePermissionService.getRolePermission(1);
        System.out.println(result);
    }

    @Test
    void getRolePermissionBySysAdmin() {
        Result result = (Result) rolePermissionService.getRolePermissionBySysAdmin(1);
        System.out.println(result);
    }
}