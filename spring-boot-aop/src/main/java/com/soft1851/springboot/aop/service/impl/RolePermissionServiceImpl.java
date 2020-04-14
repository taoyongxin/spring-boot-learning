package com.soft1851.springboot.aop.service.impl;

import com.soft1851.springboot.aop.common.Result;
import com.soft1851.springboot.aop.common.ResultCode;
import com.soft1851.springboot.aop.mapper.RolePermissionMapper;
import com.soft1851.springboot.aop.service.RolePermissionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @author Tao
 * @version 1.0
 * @ClassName RolePermissionServiceImpl
 * @Description TODO
 * @date 2020-04-13 21:35
 **/
@Service
@Slf4j
public class RolePermissionServiceImpl implements RolePermissionService {
    @Resource
    private RolePermissionMapper rolePermissionMapper;

    @Override
    public Result getRolePermission(int roleId) {
        List<Map> rolePermissionList = null;
        try {
            rolePermissionList = rolePermissionMapper.getRolePermission(roleId);
        } catch (SQLException e) {
            return Result.failure(ResultCode.DATABASE_ERROR);
        }
        return Result.success(rolePermissionList);
    }

    @Override
    public List<Map<String, Object>> getRolePermissionBySysAdmin(int sysAdminId) {
        return rolePermissionMapper.getRoleById(sysAdminId);
    }
}
