package com.inf191.lachesis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication

@MapperScan("com/inf191/lachesis/generate")
public class LachesisApplication {
    @ResponseBody
    public static void main(String[] args) {
        SpringApplication.run(LachesisApplication.class, args);
    }

}
