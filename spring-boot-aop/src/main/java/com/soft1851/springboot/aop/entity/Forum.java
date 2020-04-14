package com.soft1851.springboot.aop.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author Tao
 * @version 1.0
 * @ClassName Forum
 * @Description TODO
 * @date 2020-04-13 19:10
 **/
@Data
@Builder
public class Forum {
    private Integer forumId;
    private String forumName;
}
