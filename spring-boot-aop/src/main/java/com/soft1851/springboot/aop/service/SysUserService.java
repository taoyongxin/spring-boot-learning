package com.soft1851.springboot.aop.service;

import com.soft1851.springboot.aop.common.Result;

/**
 * @author Tao
 * @version 1.0
 * @ClassName SysUserService
 * @Description TODO
 * @date 2020-04-13 20:08
 **/
public interface SysUserService {
    /**
     * 根据用户id查询用户数据
     * @param userId
     * @return
     */
    Result getSysUserByUserId(int userId);

    /**
     * 根据用户id查询用户数据和权限
     * @param userId
     * @return
     */
    Result getSysUserByAll(int userId);
}
