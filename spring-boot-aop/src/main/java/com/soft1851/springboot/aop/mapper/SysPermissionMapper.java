package com.soft1851.springboot.aop.mapper;

import com.soft1851.springboot.aop.entity.SysPermission;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * @author Tao
 */
public interface SysPermissionMapper {
    /**
     * 根据资源id查询
     * @param id
     * @return
     */
    @Select("SELECT * FROM sys_permission WHERE p_id=#{id}")
    SysPermission getPermissionById(int id);

    /**
     * 根据资源id查询资源及子类资源
     * @param id
     * @return
     */
    @Results({
            @Result(property = "p_id", column = "p_id"),
            @Result(property = "subList", column = "p_id",
                    many=@Many(select="com.soft1851.springboot.aop.mapper.SysPermissionMapper.getPermissionByParentId")),
    })
    @Select("SELECT * FROM sys_permission WHERE p_id=#{id}")
    Map<String, Object> getChildPermissionById(int id);

    /**
     * 根据父类id查询子类资源
     * @param parentId
     * @return
     */
    @Results({
            @Result(property = "p_id", column = "p_id"),
            @Result(property = "subList", column = "p_id",
                    one=@One(select="com.soft1851.springboot.aop.mapper.SysPermissionMapper.getPermissionByParentId")),
    })
    @Select("SELECT * FROM sys_permission WHERE parent_id=#{parentId}")
    List<Map<String, Object>> getPermissionByParentId(int parentId);
}
