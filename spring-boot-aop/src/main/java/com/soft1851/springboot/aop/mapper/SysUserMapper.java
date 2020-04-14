package com.soft1851.springboot.aop.mapper;

import com.soft1851.springboot.aop.entity.SysUser;
import org.apache.ibatis.annotations.Select;

import java.sql.SQLException;
import java.util.Map;

/**
 * @author Tao
 * @version 1.0
 * @ClassName SysUserMapper
 * @Description TODO
 * @date 2020-04-13 20:03
 **/
public interface SysUserMapper {
    /**
     * 根据用户id查询用户数据
     * @param userId
     * @return
     */
    @Select("SELECT * FROM sys_user WHERE user_id = #{userId}")
    SysUser getSysUserByUserId(Integer userId);

    /**
     * 根据用户id查询用户数据和权限
     * @param userId
     * @return
     * @throws SQLException
     */
    @Select("SELECT t1.*,t2.* " +
            "FROM user_role t3 " +
            "LEFT JOIN sys_user t1 " +
            "ON t1.user_id = t3.user_id " +
            "LEFT JOIN sys_role t2 " +
            "ON t2.role_id = t3.role_id " +
            "WHERE t3.user_id = #{userId}")
    Map getSysUserByAll(int userId) throws SQLException;
}
