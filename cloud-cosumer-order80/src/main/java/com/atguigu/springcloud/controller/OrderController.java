package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author : zjj
 * @date : 2020/6/6 18:12
 */

@RestController
@RequestMapping("consumer")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;


//    public static final String PAYMENT_URL = "http://localhost:8001";
    public static  final  String PAYMENT_URL ="http://CLOUD-PAYMENT-SERVICE";
    @GetMapping("/getPaymentById/{id}")
    public CommonResult getPayment(@PathVariable("id") Long id){

        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" +id,CommonResult.class);
    }

    @PostMapping("/createPayment")
    public CommonResult createPayment(Payment payment){

        return restTemplate.postForObject(PAYMENT_URL + "/payment/create",payment,CommonResult.class);
    }


}
