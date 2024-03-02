package com.xuecheng.base.exception;

/**
 * @Description 和前端约定返回的异常信息类模型
 * @Classname RestErrorResponse
 * @Date 2024/2/7 20:38
 * @Created by wangjuntao
 */

import java.io.Serializable;

/**
 * 错误响应参数包装
 */
public class RestErrorResponse implements Serializable {

    private String errMessage;

    public RestErrorResponse(String errMessage){
        this.errMessage= errMessage;
    }

    public String getErrMessage() {
        return errMessage;
    }

    public void setErrMessage(String errMessage) {
        this.errMessage = errMessage;
    }
}