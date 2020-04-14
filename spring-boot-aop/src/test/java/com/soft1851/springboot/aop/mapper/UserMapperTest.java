package com.soft1851.springboot.aop.mapper;

import com.soft1851.springboot.aop.SpringBootAopApplication;
import com.soft1851.springboot.aop.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = SpringBootAopApplication.class)
class UserMapperTest {
    @Resource
    private UserMapper userMapper;

    @Test
    void getUserByRoleName() throws SQLException {
        User user = userMapper.getUserByRoleName("admin");
        System.out.println(user);
    }
}