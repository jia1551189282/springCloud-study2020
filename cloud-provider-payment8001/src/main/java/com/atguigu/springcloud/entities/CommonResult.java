package com.atguigu.springcloud.entities;

/**
 * @author : zjj
 * @date : 2020/6/6 11:36
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 通用结果集
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CommonResult<T> {

    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
