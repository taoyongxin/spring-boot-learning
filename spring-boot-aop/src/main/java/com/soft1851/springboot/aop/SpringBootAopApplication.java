package com.soft1851.springboot.aop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Tao
 */
@SpringBootApplication
@MapperScan("com.soft1851.springboot.aop.mapper")
@EnableSwagger2
public class SpringBootAopApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootAopApplication.class, args);
    }
}
