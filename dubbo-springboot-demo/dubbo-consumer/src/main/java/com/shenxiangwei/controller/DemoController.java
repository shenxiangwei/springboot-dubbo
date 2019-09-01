package com.shenxiangwei.controller;

import com.shenxiangwei.service.SayHello;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * create by shenxiangwei on 2019/9/1 上午 11:51
 */
@RestController
public class DemoController {

    @Reference(version = "${demo.service.version}")
    private SayHello sayHello;

    @RequestMapping(value ="/hello" ,method = RequestMethod.GET)
    public String getMessage(){
        return sayHello.sayHello("shenxiangwei");
    }
}
