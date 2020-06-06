package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author : zjj
 * @date : 2020/6/6 11:32
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Payment implements Serializable {
    /**
     * id
     */
    private Long id;
    /**
     * 流水号
     */
    private String serial;
}
