package com.soft1851.springboot.aop.mapper;

import com.soft1851.springboot.aop.SpringBootAopApplication;
import com.soft1851.springboot.aop.entity.Forum;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.sql.SQLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = SpringBootAopApplication.class)
class ForumMapperTest {

    @Resource
    private ForumMapper forumMapper;

    @Test
    void getAllForum() throws SQLException {
        List<Forum> forums = forumMapper.getAllForum();
        System.out.println(forums);
    }
}