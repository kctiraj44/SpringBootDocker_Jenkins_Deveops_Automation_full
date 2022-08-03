package com.example.dockerjenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DeveopsIntegrationDockerJenkinsApplication {

    @GetMapping("/get")
    public String GetMs1(){
        return  "*---------This is the Github jenkins Docker deveops integration -----*";
    }


    public static void main(String[] args) {
        SpringApplication.run(DeveopsIntegrationDockerJenkinsApplication.class, args);
    }

}
