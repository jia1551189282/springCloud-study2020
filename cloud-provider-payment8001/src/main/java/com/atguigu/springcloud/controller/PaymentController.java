package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author : zjj
 * @date : 2020/6/6 17:41
 */
@RestController
@RequestMapping("payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    /**
     * 新增一条支付
     * @param payment
     * @return
     */
    @PostMapping("/create")
    public CommonResult payment(@RequestBody Payment payment){

        int result = paymentService.create(payment);
        if(1 == result){
            return new CommonResult(200,"成功",result);
        }else {
            return new CommonResult(444,"失败",result);
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
        return new CommonResult(200,"成功",payment);
    }
}
