package com.wwl.wwl;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.wwl.wwl")
@MapperScan(basePackages = {"com.wwl.wwl.mapper"})

public class WwlApplication {
    public static void main(String[] args) {
        SpringApplication.run(WwlApplication.class, args);
    }

}
