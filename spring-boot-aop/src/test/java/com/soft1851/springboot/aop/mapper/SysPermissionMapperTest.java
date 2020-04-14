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
class SysPermissionMapperTest {

    @Resource
    private SysPermissionMapper sysPermissionMapper;

    @Test
    void getPermissionById() throws SQLException {
        SysPermission sysPermission = sysPermissionMapper.getPermissionById(1);
        System.out.println(sysPermission);
    }

    @Test
    void getPermissionByParentId() throws SQLException{
        List<Map<String,Object>> mapList = sysPermissionMapper.getPermissionByParentId(1);
        System.out.println(mapList);
    }

    @Test
    void getChildPermissionById() throws SQLException{
        Map<String,Object> map = sysPermissionMapper.getChildPermissionById(1);
        System.out.println(map);
    }
}