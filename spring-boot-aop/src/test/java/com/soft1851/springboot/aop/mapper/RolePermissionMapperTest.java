package com.soft1851.springboot.aop.mapper;

import com.soft1851.springboot.aop.SpringBootAopApplication;
import com.soft1851.springboot.aop.entity.SysPermission;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@SpringBootTest(classes = SpringBootAopApplication.class)
class RolePermissionMapperTest {
    @Resource
    private RolePermissionMapper rolePermissionMapper;

    @Test
    void getRolePermission() throws SQLException {
        List<Map> mapList = rolePermissionMapper.getRolePermission(1);
        System.out.println(mapList);
    }



    @Test
    void getSysPermission() throws SQLException{
        List<SysPermission> list = rolePermissionMapper.getSysPermission(1);
        System.out.println(list);
    }

    @Test
    void getRoleById() throws SQLException{
        List<Map<String,Object>> mapList = rolePermissionMapper.getRoleById(1);
        System.out.println(mapList);
    }
}