package com.ay;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ay.mapper")
public class StudentApplication {
    public static void main(String[] args) {
        new SpringApplication(StudentApplication.class).run(args);
    }
}
