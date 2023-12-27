package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.demo.Repository", "com.demo.Service"})
public class EmploywiseAssignmentApplication {
    public static void main(String[] args) {
        SpringApplication.run(EmploywiseAssignmentApplication.class, args);
    }
}


