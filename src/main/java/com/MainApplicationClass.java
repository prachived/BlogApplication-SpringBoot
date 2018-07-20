package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.controller","com.model","com.repository"})
@EnableJpaRepositories("com.repository")
public class MainApplicationClass {

    public static void main(String[] args)
    {
        SpringApplication.run(MainApplicationClass.class, args);
    }

}
