package com.atguigu.springcloud.service;

import org.springframework.stereotype.Service;

/**
 * @author ZJJ
 * @date 2020/6/11 0011 下午 5:04
 */


public interface PaymentService {

    public String payment_ok(Integer id);

    public String payment_timeout(Integer id);
}
