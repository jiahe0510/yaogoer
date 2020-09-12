package com.yaogo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.yaogo")
@ConfigurationPropertiesScan
public class YaogoerApplication {

    public static void main(String[] args) {
        SpringApplication.run(YaogoerApplication.class, args);
    }

}
