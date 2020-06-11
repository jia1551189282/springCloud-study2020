package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZJJ
 * @date 2020/6/11 0011 上午 11:40
 */

@RestController
@Slf4j
public class FeignOrderController {

    @Autowired
    private PaymentFeignService paymentFeignService;


    /**
     * 通过feign 的方式来调用
     *
     * @param id
     * @return
     */
    @GetMapping("/feign/consumer/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        return paymentFeignService.paymentGet(id);
    }

    /**
     * 模拟超时处理
     *
     * @return
     */
    @GetMapping("/feign/consumer/payment/timeout")
    public String feignTimeout(){

        return paymentFeignService.paymentFeignTimeout();
    }
}
