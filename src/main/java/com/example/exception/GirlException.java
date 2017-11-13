package com.example.exception;

import com.example.domain.Girl;
import com.example.domain.Result;
import com.example.enums.ResultEnum;
import lombok.Data;

/**
 * @author lyz
 * @date 2017-11-11
 */
@Data
public class GirlException extends RuntimeException{

    private Integer code;

    public GirlException(ResultEnum resultEnum){
        super(resultEnum.msg());
        this.code = resultEnum.code();
    }
}
