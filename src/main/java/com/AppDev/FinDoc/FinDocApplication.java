package com.AppDev.FinDoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class FinDocApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinDocApplication.class, args);
    }
}
