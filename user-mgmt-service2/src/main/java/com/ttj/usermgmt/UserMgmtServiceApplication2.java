package com.ttj.usermgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = {"com.ttj"})
public class UserMgmtServiceApplication2 {

	public static void main(String[] args) {
		SpringApplication.run(UserMgmtServiceApplication2.class, args);
	}

}
