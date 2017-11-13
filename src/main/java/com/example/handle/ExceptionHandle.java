package com.example.handle;

import com.example.domain.Result;
import com.example.exception.GirlException;
import com.example.utils.ResultUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author lyz
 * @date 2017-11-11
 */
@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e){
        if(e instanceof GirlException){
            GirlException girlException = (GirlException)e;
            return ResultUtil.error(girlException.getMessage(),girlException.getCode());
        }else {
            return ResultUtil.error("未知错误",-1);
        }
    }
}
