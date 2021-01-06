package com.ljt;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfig
@DubboComponentScan("com.ljt.service")
@MapperScan("com.ljt.mapper")
public class PrivoderApp {

    public static void main(String[] args) {

        SpringApplication.run(PrivoderApp.class,args);
    }
}
