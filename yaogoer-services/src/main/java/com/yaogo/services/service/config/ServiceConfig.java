package com.yaogo.services.service.config;


import com.yaogo.dal.repo.config.DalConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "com.yaogo.services.service")
@Import({DalConfig.class})
public class ServiceConfig {
}
