package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author : zjj
 * @date : 2020/6/9 20:18
 */
@RestController
@Slf4j
public class ConsulPaymentController {

    @Value("${server.port}")
    public String port;


    @GetMapping("payment/consul")
    public String paymentConsul(){
        return "springCloud with consul : " + port + "\t"  + UUID.randomUUID().toString();
    }
}
