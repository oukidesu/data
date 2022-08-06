package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.util")
public class PassWordApplication {

    public static void main(String[] args) {
        SpringApplication.run(PassWordApplication.class, args);
    }

}
