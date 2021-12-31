package com.helder.pro.geladariaingra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

//ComponentScan força a leitura dos pacotes, usar conteúdo do ComponentScan (basePackages = "com.helder.pro.geladariaingra")quando a classe  não estiver na raiz o start
@EnableAutoConfiguration
@ComponentScan
public class ApplicationStart {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationStart.class, args);
    }
}
