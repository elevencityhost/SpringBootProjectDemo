package com.example.util;

import com.example.domain.Result;

/**
 * @author 十一城城主
 * @data 2018/1/15 18:11
 */
public class ResultUtil {
    public static Result success(Object object){
        Result<Object> result = new Result<>();
        result.setCode(0);
        result.setMsg("添加成功");
        result.setData(object);
        return result;
    }
    public static Result success(){
        return success(null);
    }
    public static Result error(Integer code,String msg){
        Result<Object> result = new Result<>();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
