package com.yaogo.rest.config;


import com.yaogo.services.config.ServiceConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"com.yaogo.rest"})
@Import(ServiceConfig.class)
public class RestConfig {
}
