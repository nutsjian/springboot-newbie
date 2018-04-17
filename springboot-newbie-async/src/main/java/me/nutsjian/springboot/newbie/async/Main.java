package me.nutsjian.springboot.newbie.async;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@EnableAutoConfiguration
@ComponentScan(basePackages = "me.nutsjian.springboot.newbie.async")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
