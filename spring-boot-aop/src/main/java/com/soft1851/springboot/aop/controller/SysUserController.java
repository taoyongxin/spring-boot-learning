package com.soft1851.springboot.aop.controller;

import com.soft1851.springboot.aop.annotation.AuthToken;
import com.soft1851.springboot.aop.common.Result;
import com.soft1851.springboot.aop.service.SysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Tao
 * @version 1.0
 * @ClassName SysUserController
 * @Description TODO
 * @date 2020-04-13 20:18
 **/
@RestController
@RequestMapping(value = "/api/sysUser")
@Api(value = "SysUserController",tags = {"系统用户模块接口"})
public class SysUserController {
    @Resource
    private SysUserService sysUserService;

    @ApiOperation(value = "根据系统用户id查询用户数据",notes = "data为用户数据")
//    @AuthToken(role_name = {"超级管理员","系统管理员"})
    @GetMapping(value = "/{sysUserId}")
    public Result getSysUserByUserId(@PathVariable int sysUserId){
        return sysUserService.getSysUserByUserId(sysUserId);
    }

    @ApiOperation(value = "根据系统用户id查询用户数据(包含角色信息)",notes = "data为用户数据")
    @GetMapping(value = "/role")
    @AuthToken(role_name = "超级管理员")//去验证是否为超级管理员
//    @AuthToken(role_name = {"超级管理员","系统管理员"})
    public Result getSysUserByAll(@Param("id") int id){
        return sysUserService.getSysUserByAll(id);
    }
}
