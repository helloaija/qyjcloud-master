package com.qyj.qyjcloud.service.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * feign拦截器
 */
@Component
public class FeignInterceptor implements RequestInterceptor {
    private final String key = "Authorization";

    @Override
    public void apply(RequestTemplate requestTemplate) {
        requestTemplate.header("Authorization", ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                .getRequest().getHeader("Authorization"));
    }
}
