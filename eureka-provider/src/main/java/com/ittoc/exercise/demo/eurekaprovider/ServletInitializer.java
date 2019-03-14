package com.ittoc.exercise.demo.eurekaprovider;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

    /**
     *
     * @author lix
     * @version V1.0.0
     * @since V1.0.0
     * @date  2019-03-05 21:18
     * @param  application
     * @return org.springframework.boot.builder.SpringApplicationBuilder
     **/
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(EurekaProviderApplication.class);
    }

}
