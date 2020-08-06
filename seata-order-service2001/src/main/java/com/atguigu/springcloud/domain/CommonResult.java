package com.atguigu.springcloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ZJJ
 * @date 2020/8/6 0006 下午 3:02
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;
    private String message;

    private T data;

    public CommonResult(Integer code,String message){
        this.code = code;
        this.message = message;
    }
}
