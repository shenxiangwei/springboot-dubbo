package com.shenxiangwei.service;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

/**
 * create by shenxiangwei on 2019/9/1 上午 11:47
 */
@Service(version = "${demo.service.version}")
public class DemoService implements SayHello{

    @Value("${dubbo.application.name}")
    private String serviceName;

    @Override
    public String sayHello(String name) {
        return String.format("[%s] : Hello, %s", serviceName, name);
    }
}
