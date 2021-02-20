package com.example.jenkinsmavenspringinitializr.jenkinsmavenspringinitializrdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsmavenspringinitializrdemoApplication {

    @GetMapping({"/","/index"})
    public String index(){
        return "SpringBoot项目启动成功";
    }


    public static void main(String[] args) {
        SpringApplication.run(JenkinsmavenspringinitializrdemoApplication.class, args);
    }

}
