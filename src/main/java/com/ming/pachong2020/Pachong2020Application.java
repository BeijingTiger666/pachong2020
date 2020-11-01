package com.ming.pachong2020;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.dao")
public class Pachong2020Application {

    public static void main(String[] args) {
        SpringApplication.run(Pachong2020Application.class, args);
    }

}
