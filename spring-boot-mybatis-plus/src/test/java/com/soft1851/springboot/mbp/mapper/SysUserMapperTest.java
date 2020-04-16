package com.soft1851.springboot.mbp.mapper;

import com.soft1851.springboot.mbp.entity.UserRoleVo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.sql.SQLException;

@SpringBootTest
class SysUserMapperTest {
    @Resource
    private SysUserMapper sysUserMapper;

    @Test
    void getAll() {
        System.out.println(sysUserMapper.getAll());
    }

    @Test
    void getSysUserById() throws SQLException {
        UserRoleVo userRoleVo = sysUserMapper.getSysUserById(1);
        System.out.println(userRoleVo);
    }
}