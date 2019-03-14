package com.ittoc.exercise.demo.customer.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Copyright (C), 2018-2019
 * FileName: HelloService
 * Author:   lix
 * Date:     2019-03-13 11:01
 * Description: helloService
 * Version: V1.0.0
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod ="hiError" ) // 制定 hystrix 快速返回的方法
    public String hiSerive(String name) {
        //restTemplate.
        return restTemplate.getForObject("http://service.hi/hi?name="+name+":from ribbon",String.class);
    }
    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
