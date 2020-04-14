package com.soft1851.springboot.aop.aspect;

import com.soft1851.springboot.aop.annotation.AuthToken;
import com.soft1851.springboot.aop.common.Result;
import com.soft1851.springboot.aop.common.ResultCode;
import com.soft1851.springboot.aop.entity.SysUser;
import com.soft1851.springboot.aop.mapper.SysUserMapper;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author Tao
 * @version 1.0
 * @ClassName AuthTokenAspect
 * @Description TODO
 * @date 2020-04-13 15:40
 **/
@Aspect
@Component
@Slf4j
public class AuthTokenAspect {
    /**
     * 配置加上自定义注解的方法为切点
     * @param authToken
     */
    @Pointcut("@annotation(authToken)")
    public void doAuthToken(AuthToken authToken){
    }
    @Resource
    private SysUserMapper sysUserMapper;

    @Around(value = "doAuthToken(authToken)",argNames = "pjp,authToken")
    public Object doAround(ProceedingJoinPoint pjp,AuthToken authToken) throws Throwable{
        ServletRequestAttributes sra = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        assert sra != null;
        HttpServletRequest request = sra.getRequest();
        //取得注解中的role_name
        String[] roleNames = authToken.role_name();
        String id = request.getParameter("id");
        Map map = sysUserMapper.getSysUserByAll(Integer.parseInt(id));
        SysUser sysUser = null;
        //没有role的值
        if (roleNames.length <= 1){
            //只需要认证（登录）
            //获取参数
//            String id = request.getParameter("id");
//            map = sysUserMapper.getSysUserByAll(Integer.parseInt(id));
            System.out.println(map.get("role_name"));
            //如果id为空，证明用户没有登录,可以调用目标方法
            if (map.get("role_name").equals(roleNames[0])){
                return pjp.proceed();
            }
            // 权限不足
            return Result.failure(ResultCode.PERMISSION_NO_Enough);
        } else {
            //验证身份
//            String role = request.getHeader("role");
            //遍历roleNames数组，匹配role
            for (String roleName : roleNames){
                if (map.get("role_name").equals(roleName)){
//                    System.out.println(roleName+","+map.get("role_name"));
                    //身份匹配成功，调用目标方法
                    return pjp.proceed();
                }
            }
            //匹配失败，该用户没有目标方法的授权
            return Result.failure(ResultCode.PERMISSION_NO_Enough);
        }
    }
}
