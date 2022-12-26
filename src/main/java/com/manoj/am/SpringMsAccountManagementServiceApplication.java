package com.manoj.am;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringMsAccountManagementServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMsAccountManagementServiceApplication.class, args);
    }

}
