package com.soft1851.springboot.mbp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.soft1851.springboot.mbp.entity.SysUser;
import com.soft1851.springboot.mbp.entity.UserRoleVo;

import java.sql.SQLException;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author tao
 * @since 2020-04-16
 */
public interface SysUserMapper extends BaseMapper<SysUser> {
    /**
     * 查询所有
     * @return
     */
    List<SysUser> getAll();

    /**
     * 根据用户id查询用户数据
     * @param userId
     * @return
     * @throws SQLException
     */
    UserRoleVo getSysUserById(int userId) throws SQLException;
}
