package com.soft1851.springboot.aop.mapper;

import com.soft1851.springboot.aop.entity.SysPermission;
import org.apache.ibatis.annotations.*;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @author Tao
 */
public interface RolePermissionMapper {
    /**
     * 根据角色id查询权限
     * @param roleId
     * @return
     * @throws SQLException
     */
    @Results({
            @Result(property = "subList",column = "p_id",
                    many = @Many(select = "com.soft1851.springboot.aop.mapper.RolePermissionMapper.getSysPermission")
            )
    })
    @Select("SELECT t1.*,t2.* " +
            "FROM sys_permission t1 " +
            "LEFT JOIN role_permission t2 " +
            "ON t2.permission_id = t1.p_id " +
            "WHERE t2.role_id = #{roleId}")
    List<Map> getRolePermission(int roleId) throws SQLException;

    /**
     * 根据父类id查询权限数据
     * @param parentId
     * @return
     */
    @Select("SELECT * FROM sys_permission WHERE parent_id = #{parentId}")
    List<SysPermission> getSysPermission(int parentId);

    /**
     * 根据角色id查询权限
     * @param id
     * @return
     */
    @Results({
            @Result(property = "permission", column = "permission_id",
                    one=@One(select="com.soft1851.springboot.aop.mapper.SysPermissionMapper.getChildPermissionById")),
    })
    @Select("SELECT * FROM role_permission WHERE role_id=#{id}")
    List<Map<String, Object>> getRoleById(int id);
}
