package com.soft1851.springboot.aop.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author Tao
 * @version 1.0
 * @ClassName RolePermission
 * @Description TODO
 * @date 2020-04-13 19:50
 **/
@Data
@Builder
public class RolePermission {
    private Integer id;
    private Integer roleId;
    private Integer permissionId;
}
