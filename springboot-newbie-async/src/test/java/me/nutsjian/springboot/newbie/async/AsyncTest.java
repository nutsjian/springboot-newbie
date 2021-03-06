package me.nutsjian.springboot.newbie.async;

import me.nutsjian.springboot.newbie.async.serivce.MyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Main.class)
public class AsyncTest {
    @Autowired
    private MyService myService;

    @Test
    public void test() throws Exception {
        myService.sendA();
        myService.sendB();
    }
}
