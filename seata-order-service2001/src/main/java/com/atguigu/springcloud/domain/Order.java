package com.atguigu.springcloud.domain;

import java.math.BigDecimal;

/**
 * @author ZJJ
 * @date 2020/8/6 0006 下午 3:02
 */
public class Order {

    private Long id;

    private Long userId;

    private Long productId;

    private Integer count;

    private BigDecimal money;

    /**
     *订单状态
     */
    private Integer status;

}
