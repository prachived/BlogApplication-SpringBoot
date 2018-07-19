package com.mainpackage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.controller","com.model"})
public class MainApplicationClass {

    public static void main(String[] args)
    {
        SpringApplication.run(MainApplicationClass.class, args);
    }

}
