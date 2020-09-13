package com.yaogo.app.config;

 import com.yaogo.rest.config.RestConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(value = "com.yaogo.app")
@Import({RestConfig.class})
public class AppConfig {
}
