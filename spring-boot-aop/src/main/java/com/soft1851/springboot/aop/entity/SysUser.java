package com.soft1851.springboot.aop.entity;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author Tao
 * @version 1.0
 * @ClassName SysUser
 * @Description TODO
 * @date 2020-04-13 19:56
 **/
@Data
@Builder
public class SysUser {
    private Integer userId;
    private String userName;
    private String avatar;
    private String realName;
    private LocalDateTime createTime;
}
