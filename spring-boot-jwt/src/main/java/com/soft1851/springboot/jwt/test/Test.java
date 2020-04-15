package com.soft1851.springboot.jwt.test;

import com.auth0.jwt.interfaces.DecodedJWT;

/**
 * @author Tao
 */
public class Test {
    public static void main(String[] args) {
        //生成token
        Encrypt encrypt = new Encrypt();
        String token = encrypt.getToken(false, "tyx", "tyx","man");
//        System.out.println(token);
        //解密token
        Decrypt decrypt = new Decrypt();
//        System.out.println("decrypt.deToken(token):"+decrypt.deToken(token));
        DecodedJWT jwt = decrypt.deToken(token);

        System.out.println("issuer: " + jwt.getIssuer());
        System.out.println("isVip:  " + jwt.getClaim("isVip").asBoolean());
        System.out.println("username: " + jwt.getClaim("username").asString());
        System.out.println("name:     " + jwt.getClaim("name").asString());
        System.out.println("sex:     " + jwt.getClaim("sex").asString());
        System.out.println("过期时间：      " + jwt.getExpiresAt());    }
}
