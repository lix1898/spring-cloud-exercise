package com.ittoc.exercise.demo.customer.serice.feign.service;

import org.springframework.stereotype.Component;

/**
 * Copyright (C), 2018-2019
 * FileName: SchedualServiceHystrix
 * Author:   lix
 * Date:     2019-03-13 16:42
 * Description: 快速处理熔断
 * Version: V1.0.0
 */
@Component
public class SchedualServiceHystrix implements SchedualServiceHi{

    @Override
    public String hiService(String name) {
        return "sorry" +name;
    }
}
