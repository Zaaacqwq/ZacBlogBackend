package com.zaaac;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.zaaac.mapper")
@EnableScheduling
public class ZacBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZacBlogApplication.class,args);
    }
}