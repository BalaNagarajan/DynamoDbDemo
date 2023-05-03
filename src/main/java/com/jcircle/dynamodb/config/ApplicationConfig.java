package com.jcircle.dynamodb.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties(prefix="user")
public class ApplicationConfig {
    
	
	private String userName;
	private String password;
}
