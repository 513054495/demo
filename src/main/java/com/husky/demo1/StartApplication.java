package com.husky.demo1;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
@EnableAdminServer
public class StartApplication {
    public static void main(String[] args){
         SpringApplication.run(StartApplication.class,args);
    }
}
