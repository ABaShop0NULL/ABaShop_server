package com.abashop.Exception;

import jdk.nashorn.internal.objects.annotations.Getter;

/**
 * @ClassName ServiceException
 * @Description 将自定义异常抛给前端
 * @Author Zhang Qing
 * @Date 2020/10/31 22:33
 */

public class ServiceException extends RuntimeException {

    private Integer code;

    /*
     * 自定义错误
     * */
    public ServiceException(Integer code, String msg) {
        super(msg);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
