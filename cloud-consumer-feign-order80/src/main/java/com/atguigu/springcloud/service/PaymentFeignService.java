package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author ZJJ
 * @date 2020/6/11 0011 上午 11:36
 */

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
    /**
     * 通过id 获取到订单
     * @param id
     * @return
     */
    @GetMapping("/payment/get/{id}")
    public CommonResult paymentGet(@PathVariable("id") Long id);
}
