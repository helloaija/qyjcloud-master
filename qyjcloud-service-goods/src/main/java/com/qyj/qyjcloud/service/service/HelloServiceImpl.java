package com.qyj.qyjcloud.service.service;

import com.qyj.qyjcloud.service.feign.HelloFeignClient;
import com.qyj.qyjcloud.service.service.impl.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService  {
    @Autowired
    private HelloFeignClient helloFeignClient;

    @Override
    public String helloPort() {
        return helloFeignClient.hello();
    }
}
