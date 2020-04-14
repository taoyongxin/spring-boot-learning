package com.soft1851.springboot.aop.mapper;

import com.soft1851.springboot.aop.entity.Forum;
import org.apache.ibatis.annotations.Select;

import java.sql.SQLException;
import java.util.List;

/**
 * @author Tao
 * @version 1.0
 * @ClassName ForumMapper
 * @Description TODO
 * @date 2020-04-13 19:11
 **/
public interface ForumMapper {
    /**
     * 查询所有论坛
     * @return
     * @throws SQLException
     */
    @Select("SELECT forum_id,forum_name From t_forum ")
    List<Forum> getAllForum() throws SQLException;
}
