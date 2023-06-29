package com.tsb.gulimail.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.tsb.gulimail.member.feign")
@SpringBootApplication
public class GulimailMemberApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimailMemberApplication.class, args);
    }
}
