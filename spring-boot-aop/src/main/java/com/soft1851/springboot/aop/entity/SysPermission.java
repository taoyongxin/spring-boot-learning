package com.soft1851.springboot.aop.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author Tao
 * @version 1.0
 * @ClassName SysPermission
 * @Description TODO
 * @date 2020-04-13 19:52
 **/
@Data
@Builder
public class SysPermission {
    private Integer pId;
    private Integer parentId;
    private String pName;
    private Integer type;
    private String icon;
    private String path;
    private String ex1;
    private Integer ex2;
}
