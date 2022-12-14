package com.tenpo.calculate.api.configuration;

import com.tenpo.calculate.api.controllers.intereceptors.AuditHistoryInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AuditHistoryInterceptorConfiguration implements WebMvcConfigurer {

    @Autowired
    AuditHistoryInterceptor productServiceInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(productServiceInterceptor);
    }

}

