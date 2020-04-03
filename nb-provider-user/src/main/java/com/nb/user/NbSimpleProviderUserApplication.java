package com.nb.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NbSimpleProviderUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(NbSimpleProviderUserApplication.class, args);
        System.err.println("=========== user started ==========");
    }

}
