package com.zyw;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})//除了这个自动扫描
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerApplication {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

}

