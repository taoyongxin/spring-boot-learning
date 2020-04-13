package com.soft1851.springboot.aop.annotation;

import java.lang.annotation.*;

/**
 * 自定义的Web的日志注解
 * @author Tao
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ControllerWebLog {
//    调用的接口名称
    String name();
//    表示该日志是否需要持久化存储
    boolean isSaved() default false;
}
