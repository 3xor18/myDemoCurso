package com.example.estadoApp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

    @Bean("ClientRest")
    public RestTemplate registerRestTemplate() {
        return new RestTemplate();
    }

}