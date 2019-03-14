package com.ittoc.exercise.demo.service.zull;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Zuul的主要功能是路由转发和过滤器。路由功能是微服务的一部分，
 * 比如／api/user转发到到user服务，/api/shop转发到到shop服务。
 * zuul默认和Ribbon结合实现了负载均衡的功能。
 * Copyright (C), 2018-2019
 * FileName: ZullApplication
 * Author:   lix
 * Date:     2019-03-13 20:15
 * Description: zull 网关
 * Version: V1.0.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableZuulProxy
public class ZullApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZullApplication.class, args);
    }
}
