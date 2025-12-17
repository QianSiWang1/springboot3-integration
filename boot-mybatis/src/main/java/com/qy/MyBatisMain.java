package com.qy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @Author qy
 * @Date 2025/12/7
 */
@MapperScan(basePackages = "com.qy.mapper")
@SpringBootApplication
@EnableAsync
public class MyBatisMain {
    public static void main(String[] args) {
        SpringApplication.run(MyBatisMain.class, args);
    }
}
