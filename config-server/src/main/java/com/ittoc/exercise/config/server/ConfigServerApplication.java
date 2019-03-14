package com.ittoc.exercise.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Copyright (C), 2018-2019
 * FileName: ConfigServerApplication
 * Author:   lix
 * Date:     2019-03-14 13:18
 * Description: 配置中心服务端
 * Version: V1.0.0
 */
@SpringBootApplication
public class ConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
