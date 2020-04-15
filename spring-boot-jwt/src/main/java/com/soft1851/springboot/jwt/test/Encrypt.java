package com.soft1851.springboot.jwt.test;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.soft1851.springboot.jwt.util.MD5Util;

import java.io.UnsupportedEncodingException;
import java.util.Date;


/**
 * @author Tao
 */
public class Encrypt {
    /**
     * 生成加密后的token
     * @param isVip 是不是VIO
     * @param username 用户名
     * @param name 姓名
     * @return
     */
    public String getToken(final boolean isVip,final String username,
                           final String name,final String sex) {
        String token=null;
//        Date expiresAt = new Date(System.currentTimeMillis() + 24L * 60L * 3600L * 1000L);
        Date expiresAt = new Date(System.currentTimeMillis() + 3L*10L * 1000L);
        try {
            token = JWT.create()
                    .withIssuer("auth0")
                    .withClaim("isVip", isVip)
                    .withClaim("username", username)
                    .withClaim("name", name)
                    .withClaim("sex",sex)
                    .withExpiresAt(expiresAt)
                    //使用了HMAC256加密算法,mySecret是用加密数字签名的秘钥
    //                .sign(Algorithm.HMAC256("mySecret"));
                    .sign(Algorithm.HMAC256(MD5Util.md5Hex(username)));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
//        System.out.println("MD5Util.md5Hex(username):" + MD5Util.md5Hex(username));
//        System.out.println("Algorithm.HMAC256(MD5Util.md5Hex(username)):"+Algorithm.HMAC256(MD5Util.md5Hex(username)));
//        System.out.println("token:"+token);
        return token;
    }
}
