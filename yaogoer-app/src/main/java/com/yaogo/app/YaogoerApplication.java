package com.yaogo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.yaogo.dal")
@EntityScan("com.yaogo.model")
public class YaogoerApplication {

    public static void main(String[] args) {
        SpringApplication.run(YaogoerApplication.class, args);
    }

}
