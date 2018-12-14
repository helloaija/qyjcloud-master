package com.qyj.qyjcloud.service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/hello")
public class HelloController {

    @Value("${server.port}")
    private String port;

    @Value("${message.title}")
    private String lanmaoId;

    @RequestMapping("/helloPort")
    public String helloPort() {
        return "hello port:" + port;
    }

    @RequestMapping("/helloConfig")
    public String helloConfig() {
        return "hello config:" + lanmaoId;
    }
}
