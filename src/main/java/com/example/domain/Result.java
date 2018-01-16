package com.example.domain;

/**
 * @function http请求返回的最外层对象
 * @author 十一城城主
 * @data 2018/1/15 17:55
 */
public class Result<T> {
    /** 返回状态码 */
    private Integer code;
    /** 提示信息 */
    private String msg;
    /** 具体的内容 */
    private T data;

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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
