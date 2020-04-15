package com.soft1851.springboot.jwt.test;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.io.UnsupportedEncodingException;
import java.util.Date;

/**
 * @author Tao
 */
public class Decrypt {

    public DecodedJWT deToken(final String token) {
        DecodedJWT jwt = null;
        //使用HMAC256加密算法，mySecret是用来加密数字签名的密钥
        JWTVerifier verifier = null;//Reusable verifier instance
        try {
            verifier = JWT.require(Algorithm.HMAC256("84a417baa294483c70e626c2f05274b9"))
                    .withIssuer("auth0")
                    .build();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        jwt = verifier.verify(token);
        System.out.println(new Date(System.currentTimeMillis()).getTime());
        System.out.println(jwt.getExpiresAt().getTime());
        return jwt;
    }
}
