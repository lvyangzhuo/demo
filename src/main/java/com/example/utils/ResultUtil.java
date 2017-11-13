package com.example.utils;

import com.example.domain.Result;

/**
 * @author lyz
 * @date 2017-11-11
 */
public class ResultUtil {


    public static Result success(Object object){
        Result result = new Result();
        result.setCode(200);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    public static Result success(){
        return success(null);
    }

    public static Result error(String msg,Integer code){
        Result result = new Result();
        result.setMsg(msg);
        result.setCode(code);
        result.setData(null);
        return result;
    }
}
