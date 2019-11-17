package com.demo.timeout;

import com.demo.timeout.tomcat.GracefulShutdown;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
public class TimeoutApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ac = SpringApplication.run(TimeoutApplication.class, args);
    }
}
