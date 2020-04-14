package com.soft1851.springboot.aop.mapper;

import com.soft1851.springboot.aop.SpringBootAopApplication;
import com.soft1851.springboot.aop.entity.SysUser;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.Map;

@SpringBootTest(classes = SpringBootAopApplication.class)
class SysUserMapperTest {
    @Resource
    private SysUserMapper sysUserMapper;
    @Test
    void getSysUserByUserId() throws SQLException {
        SysUser sysUser = sysUserMapper.getSysUserByUserId(1);
        System.out.println(sysUser);
    }

    @Test
    void getSysUserByAll() throws SQLException{
        Map map = sysUserMapper.getSysUserByAll(1);
        System.out.println(map);
    }
}