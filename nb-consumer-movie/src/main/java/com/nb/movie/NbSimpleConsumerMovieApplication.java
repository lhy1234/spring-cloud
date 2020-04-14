package com.nb.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@EnableFeignClients //使用Feign
@SpringBootApplication
public class NbSimpleConsumerMovieApplication {

    @Bean
    @LoadBalanced //为RestTemplate整合Ribbon 使其具备负载均衡的能力
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(NbSimpleConsumerMovieApplication.class, args);
        System.err.println("========= movie started ==========");
    }

}
