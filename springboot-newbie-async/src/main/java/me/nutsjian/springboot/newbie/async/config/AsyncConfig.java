package me.nutsjian.springboot.newbie.async.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
@ComponentScan
@EnableAsync
public class AsyncConfig implements AsyncConfigurer{

    ThreadPoolTaskExecutor
}
