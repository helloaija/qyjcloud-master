package com.qyj.qyjcloud.qyjcloudeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class QyjcloudEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(QyjcloudEurekaApplication.class, args);
    }
}
