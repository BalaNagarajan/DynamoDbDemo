package com.jcircle.dynamodb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder.EndpointConfiguration;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

@Configuration
public class DynamoDbConfig {

	@Bean
	public DynamoDBMapper dynamoDBMapper() {
		return new DynamoDBMapper(buildAmazonDynamoDB());
	}

	private AmazonDynamoDB buildAmazonDynamoDB() {
		
		
		
		  return AmazonDynamoDBClientBuilder
	                .standard()
	                .withEndpointConfiguration(
	                        new AwsClientBuilder.EndpointConfiguration(
	                        		"dynamodb.region.amazonaws.com", "region"
	                        )
	                )
	                .withCredentials(
	                        new AWSStaticCredentialsProvider(
	                                new BasicAWSCredentials(
	                                		"ACCESS_KEY_ID",
	                                		"ACCESS_KEY_VALUE"
	                                )
	                        )
	                )
	                .build();
		
		
		
		
		
		
	}

}
