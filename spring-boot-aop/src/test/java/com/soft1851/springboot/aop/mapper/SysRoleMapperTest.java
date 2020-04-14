package com.soft1851.springboot.aop.mapper;

import com.soft1851.springboot.aop.SpringBootAopApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.Map;

@SpringBootTest(classes = SpringBootAopApplication.class)

class SysRoleMapperTest {
    @Resource
    private SysRoleMapper sysRoleMapper;

    @Test
    void getRoleById() throws SQLException {
        Map<String,Object> map = sysRoleMapper.getRoleById(1);
        System.out.println(map);
    }
}