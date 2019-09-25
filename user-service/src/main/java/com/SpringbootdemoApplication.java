package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})//除了这个自动扫描
@SpringBootApplication
@EnableDiscoveryClient
public class SpringbootdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootdemoApplication.class, args);
    }

}
