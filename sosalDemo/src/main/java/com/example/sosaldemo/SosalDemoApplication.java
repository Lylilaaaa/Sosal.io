package com.example.sosaldemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.sosaldemo") // 指定 Mapper 的包路径
public class SosalDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SosalDemoApplication.class, args);
    }

}
