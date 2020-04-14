package com.soft1851.springboot.aop.service.impl;

import com.soft1851.springboot.aop.common.Result;
import com.soft1851.springboot.aop.common.ResultCode;
import com.soft1851.springboot.aop.entity.SysUser;
import com.soft1851.springboot.aop.mapper.SysUserMapper;
import com.soft1851.springboot.aop.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.Map;

/**
 * @author Tao
 * @version 1.0
 * @ClassName SysUserServiceImpl
 * @Description TODO
 * @date 2020-04-13 20:09
 **/
@Service
@Slf4j
public class SysUserServiceImpl implements SysUserService {
    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public Result getSysUserByUserId(int userId) {
        SysUser sysUser;
        sysUser = sysUserMapper.getSysUserByUserId(userId);
        return Result.success(sysUser);
    }

    @Override
    public Result getSysUserByAll(int userId) {
        Map map = null;
        try {
            map = sysUserMapper.getSysUserByAll(userId);
        } catch (SQLException e) {
            log.error(e.getMessage());
            return Result.failure(ResultCode.DATABASE_ERROR);
        }
        return Result.success(map);
    }
}
