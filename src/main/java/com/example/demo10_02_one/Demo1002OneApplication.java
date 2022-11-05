package com.example.demo10_02_one;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Slf4j
@SpringBootApplication
@EnableTransactionManagement
@MapperScan(value = "com.example.demo10_02_one.dao")
public class Demo1002OneApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Demo1002OneApplication.class, args);
        DataSource dataSource = context.getBean(DataSource.class);
        log.info("datasource type is :{}",dataSource);
    }

}
