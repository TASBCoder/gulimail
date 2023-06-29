package com.tsb.gulimail.ware;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class GulimailWareApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimailWareApplication.class, args);
    }
}
