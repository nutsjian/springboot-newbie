package me.nutsjian.springboot.newbie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/order", produces = "application/json;charset=utf-8")
public class OrderController {

    @GetMapping
    @ResponseBody
    public String rest() {
        return "ok order rest";
    }

}
