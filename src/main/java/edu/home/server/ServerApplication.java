package edu.home.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerApplication {

	public static void main(String[] args) {
		//System.setProperty("spring.config.name","filename"); -> To set lookup file
		SpringApplication.run(ServerApplication.class, args);
	}

}
