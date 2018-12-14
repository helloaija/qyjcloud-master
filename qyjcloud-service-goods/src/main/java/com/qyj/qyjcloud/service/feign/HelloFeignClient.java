package com.qyj.qyjcloud.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="qyjcloud-service-user")
public interface HelloFeignClient {
    @GetMapping("/hello/helloPort")
    public String hello();

}
