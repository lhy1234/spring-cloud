package com.nb.nbdiscoveryeurekaha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class NbDiscoveryEurekaHaApplication {

	public static void main(String[] args) {
		SpringApplication.run(NbDiscoveryEurekaHaApplication.class, args);
	}

}
