package com.atguigu.springche;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.atguigu.springche.mapper")
@SpringBootApplication
public class SpringCheApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCheApplication.class, args);
    }

}
