package com.ittoc.exercise.demo.customer.serice.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *Feign是自带断路器的，在D版本的Spring Cloud之后，它没有默认打开
 */
@FeignClient(value="service.hi",  fallback = SchedualServiceHystrix.class)
public interface SchedualServiceHi {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String hiService(@RequestParam(value = "name")String name);
}
