package me.nutsjian.springboot.newbie.controller;

import com.google.gson.Gson;
import me.nutsjian.springboot.newbie.dto.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    /**
     * 演示 table 中使用 th:each
     *      option 中使用 th:each
     */
    @GetMapping(value = "/list")
    public String usersList() {
        List<User> userList = new ArrayList<>();
        userList.add(new User(1, "nutsjian", 22, "Java工程师", 10000.00));
        userList.add(new User(2, "jange.me", 31, "Golang工程师", 26000.00));
        userList.add(new User(3, "qumai.me", 30, "Erlang工程师", 30000.00));
        userList.add(new User(4, "js1k.tech", 26, "IOS工程师", 20000.00));
        userList.add(new User(5, "sogood.com", 25, "Web前端工程师", 14000.00));
        userList.add(new User(6, "laugh.com", 32, "Vert.x工程师", 32000.00));
        return new Gson().toJson(userList);
    }


}
