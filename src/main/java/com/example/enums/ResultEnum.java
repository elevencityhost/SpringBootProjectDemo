package com.example.enums;

/**
 * @author 十一城城主
 * @data 2018/1/15 19:26
 */
public enum ResultEnum {
    UNKNOWN_error(-1,"未知错误"),
    SUCCESS(0,"添加成功"),
    PRIMARY_SCHOOL(100,"你还在上小学吧"),
    MIDDLE_SCHOOL(101,"你还在上中学吧"),
    HIGH_SCHOOL(102,"你还在读初中吧"),
    ;
    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
