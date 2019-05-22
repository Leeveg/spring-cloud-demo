package com.leeveg.comment;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringCloudApplication
@ComponentScan(basePackages = "com.leeveg")
public class CommentApplication {
    public static void main(String[] args) {
        SpringApplication.run(CommentApplication.class,args);
    }
}
