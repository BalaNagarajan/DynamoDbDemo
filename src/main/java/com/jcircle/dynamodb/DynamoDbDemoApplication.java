package com.jcircle.dynamodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.jcircle.dynamodb.config.ApplicationConfig;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigurationProperties(value= ApplicationConfig.class)
public class DynamoDbDemoApplication {

	

	public static void main(String[] args) {
		SpringApplication.run(DynamoDbDemoApplication.class, args);
	}

}
