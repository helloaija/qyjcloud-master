package com.qyj.qyjcloud.qyjcloudauth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableEurekaClient
@EnableResourceServer
@MapperScan("com.qyj.qyjcloud.qyjcloudauth.mapper")
public class QyjcloudAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(QyjcloudAuthApplication.class, args);
    }

}
