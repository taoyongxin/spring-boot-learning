package com.soft1851.springboot.mbp.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author Tao
 * @version 1.0
 * @ClassName UserRoleVo
 * @Description TODO
 * @date 2020-04-16 15:15
 **/
@Data
public class UserRoleVo {
    private Integer userId;
    private String userName;
    private String avatar;
    private String realName;
    private LocalDateTime createTime;
    private Integer roleId;
    private String roleName;
    private String description;
}
