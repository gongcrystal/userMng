package com.gupaoedu.example.springcloudconfigserver9091;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigServer
@SpringBootApplication
public class SpringCloudConfigServer9091Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigServer9091Application.class, args);
    }
}
