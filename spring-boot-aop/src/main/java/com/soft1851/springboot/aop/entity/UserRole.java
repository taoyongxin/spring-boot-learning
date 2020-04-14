package com.soft1851.springboot.aop.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author Tao
 * @version 1.0
 * @ClassName UserRole
 * @Description TODO
 * @date 2020-04-13 19:59
 **/
@Data
@Builder
public class UserRole {
    private Integer id;
    private  String userId;
    private  Integer roleId;
}