package com.example.enums;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author lyz
 * @date 2017-11-11
 */
@AllArgsConstructor
public enum ResultEnum {
    OK(200, "ok"),
    NO_18(100, "no 18"),
    NO_13(101, "no 13"),
    DEMO(102,"demo");
    private Integer code;
    private String msg;

    public Integer code(){
        return this.code;
    }

    public String msg(){
        return this.msg;
    }

}
