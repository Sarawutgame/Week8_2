package com.example.week8_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Week82Application {

    public static void main(String[] args) {
        SpringApplication.run(Week82Application.class, args);
    }

}
