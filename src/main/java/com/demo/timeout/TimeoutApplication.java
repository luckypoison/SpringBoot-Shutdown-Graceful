package com.demo.timeout;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class TimeoutApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ac = SpringApplication.run(TimeoutApplication.class, args);
    }
}
