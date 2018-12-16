package com.qyj.qyjcloud.service.feign;

import com.qyj.qyjcloud.service.feign.fallback.HelloFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="qyjcloud-service-user", fallback = HelloFallBack.class)
public interface HelloFeignClient {
    @GetMapping("/hello/helloPort")
    String hello();

}
