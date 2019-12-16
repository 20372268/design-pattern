package com.example.killswitch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class KillswitchApplication {

    public static void main(String[] args) {
        SpringApplication.run(KillswitchApplication.class, args);


    }

}
