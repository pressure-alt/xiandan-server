package com.huang.web;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author huang
 *
 */

@SpringBootApplication()
@MapperScan(basePackages = "com.huang.dao.mapper")
public class XiandanApplication {
    public static void main(String[] args) {
        SpringApplication.run(XiandanApplication.class,args);
    }
}
