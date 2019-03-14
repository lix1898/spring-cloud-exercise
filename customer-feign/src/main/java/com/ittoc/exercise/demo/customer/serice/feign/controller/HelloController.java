package com.ittoc.exercise.demo.customer.serice.feign.controller;

import com.ittoc.exercise.demo.customer.serice.feign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright (C), 2018-2019
 * FileName: HelloController
 * Author:   lix
 * Date:     2019-03-13 14:41
 * Description: hello controller
 * Version: V1.0.0
 */
@RestController
public class HelloController {
    @Autowired
    SchedualServiceHi schedualServiceHi;
    @GetMapping("/hi")
    public String sayHi(String name) {
        return schedualServiceHi.hiService(name+":from feign");
    }

}
