package com.ittoc.exercise.demo.customer.ribbon.action;

import com.ittoc.exercise.demo.customer.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright (C), 2018-2019
 * FileName: HelloControler
 * Author:   lix
 * Date:     2019-03-13 11:24
 * Description: hello controler
 * Version: V1.0.0
 */
@RestController
public class HelloControler {
    @Autowired
    HelloService helloService;

    @GetMapping("/hi")
    public String hi(@RequestParam String name ) {
        return helloService.hiSerive(name);
    }
}
