package com.zhou.testareo;

import javafx.application.Application;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication

//public class TestareoApplication extends SpringBootServletInitializer {
//
//    public static void main(String[] args) {
//        SpringApplication.run(TestareoApplication.class, args);
//    }
//
//
//}
@MapperScan("com.zhou.testareo.mapper")
@EnableCaching
public class TestareoApplication  {

    public static void main(String[] args) {
        SpringApplication.run(TestareoApplication.class, args);
    }


}
