package com.driver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.driver.Dao")
@SpringBootApplication
public class myspringbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(myspringbootApplication.class);
    }
}
