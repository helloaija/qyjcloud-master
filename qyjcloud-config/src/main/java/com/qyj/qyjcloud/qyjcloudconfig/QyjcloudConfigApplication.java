package com.qyj.qyjcloud.qyjcloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class QyjcloudConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(QyjcloudConfigApplication.class, args);
    }

}

