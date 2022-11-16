package com.test;

import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 스프링 웹 위한 기본 설정 어노테이션
public class Webstart  {

    public static void main(String[] args) {

        SpringApplication.run(Webstart.class);
    }

}
