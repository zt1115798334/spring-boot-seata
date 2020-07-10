package com.example.sbmbusinessservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhang
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SbmBusinessServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbmBusinessServiceApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
