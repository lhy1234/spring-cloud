package com.nb.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class NbDiscoverEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(NbDiscoverEurekaApplication.class, args);
        System.err.println("======= eureka started ========");
    }

}
