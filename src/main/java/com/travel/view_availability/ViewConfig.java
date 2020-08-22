package com.travel.view_availability;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;

@Configuration
public class ViewConfig {
	@Bean 
	@LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
}
}
