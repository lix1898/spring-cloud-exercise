package com.ittoc.exercise.demo.eurekaprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright (C), 2018-2019
 * FileName: HiAction
 * Author:   lix
 * Date:     2019-03-04 08:13
 * Description: 测试action
 * Version: V1.0.0
 */
@RestController
public class HiAction {
    @Value("${server.port}")
    String port;


    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "xiaoyaoclient") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }


}
