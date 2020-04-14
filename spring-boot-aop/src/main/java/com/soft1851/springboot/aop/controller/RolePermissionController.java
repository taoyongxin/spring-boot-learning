package com.soft1851.springboot.aop.controller;

import com.soft1851.springboot.aop.annotation.AuthToken;
import com.soft1851.springboot.aop.common.Result;
import com.soft1851.springboot.aop.service.RolePermissionService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Tao
 * @version 1.0
 * @ClassName RolePermissionController
 * @Description TODO
 * @date 2020-04-14 10:06
 **/
@RestController
@RequestMapping(value = "/rolePermission")
public class RolePermissionController {
    @Resource
    private RolePermissionService rolePermissionService;

    @GetMapping("/sysAdmin")
    @AuthToken(role_name = "超级管理员")
    public Result getBySysId(@Param("id") int id) {
        return Result.success(rolePermissionService.getRolePermissionBySysAdmin(id));
    }

}
