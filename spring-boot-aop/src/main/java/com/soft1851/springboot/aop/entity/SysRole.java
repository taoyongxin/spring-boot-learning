package com.soft1851.springboot.aop.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author Tao
 * @version 1.0
 * @ClassName SysRole
 * @Description TODO
 * @date 2020-04-13 19:54
 **/
@Data
@Builder
public class SysRole {
    private Integer roleId;
    private String roleName;
    private String description;
}
