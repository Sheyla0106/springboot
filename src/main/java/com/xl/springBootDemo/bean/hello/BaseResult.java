package com.xl.springBootDemo.bean.hello;

public class BaseResult {
    private String msg;
    private String code;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    BaseResult(String msg, String code) {
        this.code=code;
        this.msg=msg;
    }
}
