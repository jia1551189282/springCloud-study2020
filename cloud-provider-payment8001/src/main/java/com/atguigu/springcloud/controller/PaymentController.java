package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author : zjj
 * @date : 2020/6/6 17:41
 */
@RestController
@RequestMapping("payment")
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    public String  serverPort;

    @Resource
    private DiscoveryClient discoveryClient;

    /**
     * 新增一条支付
     * @param payment
     * @return
     */
    @PostMapping("/create")
    public CommonResult payment(@RequestBody Payment payment){

        int result = paymentService.create(payment);
        if(1 == result){
            return new CommonResult(200,"成功" + serverPort,result);
        }else {
            return new CommonResult(444,"失败" + serverPort,result);
        }
    }

    /**
     * 由主键搜索支付
     * @param id
     * @return
     */
    @GetMapping("/get/{id}")
    public CommonResult paymentGet(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        return new CommonResult(200,"成功" + serverPort,payment);
    }

    /**
     * 获取实例信息
     * @return
     */
    @GetMapping("/discovery")
    public Object disdovery(){
        List<String> services = discoveryClient.getServices();
        for (String element : services
             ) {
            log.info("====================element:{}",element);
            
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance s :
                instances) {
            log.info("====================serviceId:{},port:{},uri:{}",s.getInstanceId(),s.getPort(),s.getUri());
        }
        return discoveryClient;
    }


    /**
     * 模拟超时
     *
     * @return
     */
    @GetMapping("feign/timeout")
    public String paymentFeignTimeout(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return serverPort;
    }
}
