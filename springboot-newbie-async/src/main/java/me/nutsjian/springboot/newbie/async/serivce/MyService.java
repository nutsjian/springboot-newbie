package me.nutsjian.springboot.newbie.async.serivce;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Async
    public void sendA() throws InterruptedException {
        System.out.println("send A");
        Long startTime = System.currentTimeMillis();
        Thread.sleep(2000);
        Long endTime = System.currentTimeMillis();
        System.out.println("耗时：" + (endTime - startTime));
    }

    @Async
    public void sendB() throws InterruptedException {
        System.out.println("send B");
        Long startTime = System.currentTimeMillis();
        Thread.sleep(2000);
        Long endTime = System.currentTimeMillis();
        System.out.println("耗时：" + (endTime - startTime));
    }

}
