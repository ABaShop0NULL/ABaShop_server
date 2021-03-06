package com.abashop.controller;

import com.abashop.utils.ValidateCode;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName ValidateCodeController
 * @Description 验证码接口
 * @Author Zhang Qing
 * @Date 2020/11/25 20:37
 */
@RestController
@RequestMapping("/api/validateCode")
public class ValidateCodeController {

    // 生成验证码图片  成功
    @RequestMapping("/getCaptchaImage")
    @ResponseBody
    public void getCaptcha(HttpServletRequest request, HttpServletResponse response) {

        try {

            response.setContentType("image/png");
            response.setHeader("Cache-Control", "no-cache");
            response.setHeader("Expire", "0");
            response.setHeader("Pragma", "no-cache");

            ValidateCode validateCode = new ValidateCode();

            // 直接返回图片
            validateCode.getRandomCodeImage(request, response);

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
