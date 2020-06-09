package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author : zjj
 * @date : 2020/6/9 20:30
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerConsulMain80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerConsulMain80.class,args);
    }
}
