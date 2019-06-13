package com.gaunyi.batteryonline.common;

import lombok.Data;

/**
 * Created by S0111 on 2019/6/13.
 * 返回的结果集
 */

public class BaseResult {

    private String code="200";//状态码
    private String msg="ok";//提示消息

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "BaseResult{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}
