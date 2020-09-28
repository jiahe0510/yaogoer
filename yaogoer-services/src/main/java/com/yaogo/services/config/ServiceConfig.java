package com.yaogo.services.config;


import com.yaogo.dal.repo.config.DalConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "com.yaogo.services")
@Import({DalConfig.class})
public class ServiceConfig {
}
