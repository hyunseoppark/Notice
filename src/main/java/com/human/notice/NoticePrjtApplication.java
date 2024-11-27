package com.human.notice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = {"com.human.notice.repository"})
public class NoticePrjtApplication {

    public static void main(String[] args) {
        SpringApplication.run(NoticePrjtApplication.class, args);
    }

}
