package com.soft1851.springboot.jwt.config;

import com.soft1851.springboot.jwt.interceptor.JwtInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * @author Tao
 * @version 1.0
 * @ClassName WebConfig
 * @Description TODO
 * @date 2020-04-15 16:34
 **/
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Resource
    private JwtInterceptor jwtInterceptor;

    /**
     * 添加拦截器配置
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        //拦截路径可自行配置多个可用，分隔开
        registry.addInterceptor(jwtInterceptor).addPathPatterns("/**").excludePathPatterns("/login").excludePathPatterns("/static/**");
    }
}
