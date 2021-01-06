package com.ljt;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfig
@DubboComponentScan("com.ljt")
public class CusmmderApp {

    public static void main(String[] args) {

        SpringApplication.run(CusmmderApp.class,args);
    }
}
