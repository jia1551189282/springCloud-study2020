package com.atguigu.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ZJJ
 * @date 2020/8/6 0006 下午 3:01
 */
@SpringBootApplication
@MapperScan("com.atguigu.springcloud")
public class SeataOrderServiceMain {

    public static void main(String[] args) {
        SpringApplication.run(SeataOrderServiceMain.class,args);
    }

}
