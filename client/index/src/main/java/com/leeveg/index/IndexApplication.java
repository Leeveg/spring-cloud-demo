package com.leeveg.index;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringCloudApplication
@ComponentScan(basePackages = "com.leeveg")
public class IndexApplication {
    public static void main(String[] args) {
        SpringApplication.run(IndexApplication.class,args);
    }
}
