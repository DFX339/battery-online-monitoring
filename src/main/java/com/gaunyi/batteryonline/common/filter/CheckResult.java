package com.gaunyi.batteryonline.common.filter;

/**
 * Created by S0111 on 2019/6/27.
 * 检查项结果
 */
public class CheckResult {
    /**
     * 是否成功验证此检查项 true-验证成功 false-验证失败
     */
    private boolean isSuccess = true;
    /**
     * 验证后检查项对应通知状态（就是如果验证不通过，置此通知书的状态）
     */
    private String status;
    /**
     * 执行检查项结果编码，检查不通过时返回
     */
    private String code;
    /**
     * 执行检查项结果信息
     */
    private String msg;

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
