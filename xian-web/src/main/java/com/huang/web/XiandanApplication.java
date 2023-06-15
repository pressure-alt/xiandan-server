package com.huang.web;

import org.mybatis.spring.annotation.MapperScan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author huang
 *
 */

@SpringBootApplication

@MapperScan(basePackages = "com.huang.*.mapper")
public class XiandanApplication {
    public static void main(String[] args) {
        SpringApplication.run(XiandanApplication.class,args);
    }
}
