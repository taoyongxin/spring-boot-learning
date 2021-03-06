package com.soft1851.springboot.jwt.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Tao
 * @version 1.0
 * @ClassName AdminService
 * @Description TODO
 * @date 2020-04-15 15:55
 **/
@Service
public class AdminService {
    public List<String> getPermissionsByRole(String role){
        Map<String,List<String>> map = new TreeMap<>();
        String[] admins = {"专辑管理","歌曲管理"};
        String[] superAdmins = {"权限管理","系统设置"};
        map.put("admin", Arrays.asList(admins));
        map.put("superAdmin",Arrays.asList(superAdmins));
        return map.get(role);
    }

    public boolean checkRole(String role){
        if ("admin".equals(role)||("superAdmin".equals(role))){
            return true;
        } else {
            return false;
        }
    }
}
