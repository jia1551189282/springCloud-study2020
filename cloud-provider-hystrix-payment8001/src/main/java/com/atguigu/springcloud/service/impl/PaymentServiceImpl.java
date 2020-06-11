package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author ZJJ
 * @date 2020/6/11 0011 下午 5:05
 */

@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public String payment_ok(Integer id) {
        return "线程池： " + Thread.currentThread().getName()
                + "   paymentInfo_OK,id:" + id + " 正常访问！";

    }

    @Override
    public String payment_timeout(Integer id) {
        int timeNumber = 3;
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        } catch (Exception e){
            e.printStackTrace();
        }
        return "线程池： " + Thread.currentThread().getName()
                + "   paymentInfo_OK,id:" + id + " 耗时(秒):" + timeNumber;
    }

}
