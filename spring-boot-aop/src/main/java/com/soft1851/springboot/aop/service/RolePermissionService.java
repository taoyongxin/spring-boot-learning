package com.soft1851.springboot.aop.service;

import com.soft1851.springboot.aop.common.Result;

import java.util.List;
import java.util.Map;

/**
 * @author Tao
 */
public interface RolePermissionService {
    /**
     * 根据角色id查询权限
     * @param roleId
     * @return
     */
    Result getRolePermission(int roleId);

    /**
     * 查询系统管理员权限
     * @param sysAdminId
     * @return
     */
    List<Map<String, Object>> getRolePermissionBySysAdmin(int sysAdminId);
}
