package com.soft1851.springboot.aop.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author Tao
 * @version 1.0
 * @ClassName User
 * @Description TODO
 * @date 2020-04-13 17:40
 **/
@Data
@Builder
public class User {
    private Integer id;
    private String roleName;
    private String account;
    private String password;
    private String salt;
}
