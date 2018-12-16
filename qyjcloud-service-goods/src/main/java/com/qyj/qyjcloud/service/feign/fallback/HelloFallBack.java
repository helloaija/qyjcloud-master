package com.qyj.qyjcloud.service.feign.fallback;

import com.qyj.qyjcloud.service.feign.HelloFeignClient;
import org.springframework.stereotype.Component;

@Component
public class HelloFallBack implements HelloFeignClient {
    @Override
    public String hello() {
        return "调用服务失败";
    }
}
