package com.ittoc.exercise.demo.customer.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Copyright (C), 2018-2019
 * FileName: CustomerRibbonApplication
 * Author:   lix
 * Date:     2019-03-05 21:21
 * Description: 启动类
 * Version: V1.0.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableHystrix // 开起hystrix 熔断
public class CustomerRibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerRibbonApplication.class,args);
    }
    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

}

