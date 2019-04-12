package com.king.condict;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication()
@ComponentScan(basePackages = "com.king.condict.daoImpl")
@EntityScan("com.king.condict.entry")
public class CondictApplication {
    public static void main(String[] args) {
        SpringApplication.run(CondictApplication.class, args);
    }

}
