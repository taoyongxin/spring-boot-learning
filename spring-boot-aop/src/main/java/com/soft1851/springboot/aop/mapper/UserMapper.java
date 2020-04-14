package com.soft1851.springboot.aop.mapper;

import com.soft1851.springboot.aop.entity.User;
import org.apache.ibatis.annotations.Select;

import java.sql.SQLException;

/**
 * @author Tao
 * @version 1.0
 * @ClassName UserMapper
 * @Description TODO
 * @date 2020-04-13 17:46
 **/
public interface UserMapper {
    /**
     * 根据角色名称查询用户
     * @param roleName
     * @return
     * @throws SQLException
     */
    @Select("SELECT * FROM t_user WHERE role_name=#{roleName}")
    User getUserByRoleName(String roleName) throws SQLException;
}
