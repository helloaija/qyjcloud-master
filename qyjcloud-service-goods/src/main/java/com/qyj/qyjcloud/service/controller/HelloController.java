package com.qyj.qyjcloud.service.controller;

import com.qyj.qyjcloud.service.service.impl.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/hello")
public class HelloController {

    @Value("${server.port}")
    private String port;
    @Value("${configtest}")
    private String lanmaoId;

    @Autowired
    private HelloService helloService;

    @RequestMapping("/helloPort")
    public String helloPort() {
        // return "hello port:" + port;
        return helloService.helloPort();
    }

    @RequestMapping("/helloConfig")
    public String helloConfig() {
        return "hello config:" + lanmaoId;
    }

}
