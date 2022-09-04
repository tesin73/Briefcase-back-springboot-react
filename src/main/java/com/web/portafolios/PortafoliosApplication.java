package com.web.portafolios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({ "com.web.portafolios.controller", "com.web.portafolios.service" })
@EntityScan("com.web.portafolios.entity")
@EnableJpaRepositories("com.web.portafolios.repository")
@SpringBootApplication
public class PortafoliosApplication {

    public static void main(String[] args) {
        SpringApplication.run(PortafoliosApplication.class, args);
    }

}