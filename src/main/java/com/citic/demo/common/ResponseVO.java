package com.citic.demo.common;

public class ResponseVO {

    private Integer code;

    private String msg;

    private Object data;

    public static ResponseVO success() {
        return new ResponseVO(null);
    }

    public static ResponseVO success(Object obj) {
        return new ResponseVO(obj);
    }

    public static ResponseVO success(Integer code, String msg) {
        return new ResponseVO(code, msg);
    }

    private ResponseVO(Object obj) {
        this.code = 200;
        this.msg = "OK";
        this.data = obj;
    }

    private ResponseVO(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
