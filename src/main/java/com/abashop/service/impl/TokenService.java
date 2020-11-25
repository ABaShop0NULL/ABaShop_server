package com.abashop.service.impl;

import com.abashop.pojo.User;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.stereotype.Service;

/**
 * @ClassName TokenService
 * @Description TODO
 * @Author Zhang Qing
 * @Date 2020/11/25 9:23
 */
@Service
public class TokenService {
    public String getToken(User user) {
        String token = "";
        token = JWT.create().withAudience(String.valueOf(user.getUserId()))
                .sign(Algorithm.HMAC256(user.getUserPassword()));
        return token;
    }
}
