package com.shenxiangwei;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * create by shenxiangwei on 2019/9/1 上午 11:20
 */
@SpringBootApplication(scanBasePackages ={"com.shenxiangwei.controller"})
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
