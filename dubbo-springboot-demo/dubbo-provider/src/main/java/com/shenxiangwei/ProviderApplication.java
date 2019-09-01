package com.shenxiangwei;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * create by shenxiangwei on 2019/9/1 上午 11:30
 */
@EnableAutoConfiguration
public class ProviderApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ProviderApplication.class)
                .run(args);
    }
}
