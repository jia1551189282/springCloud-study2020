package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author : zjj
 * @date : 2020/6/9 20:36
 */

@RestController
@Slf4j
public class OrderConsulController {

    public static final String invoke_url = "http://consul-provider-payment";

    @Resource
    private RestTemplate restTemplate;


    @GetMapping("consumer/consul")
    public String paymentInfo(){
        String result = restTemplate.getForObject(invoke_url + "/payment/consul",String.class);
        return result;
    }
}