package me.nutsjian.springboot.newbie.controller;

import me.nutsjian.springboot.newbie.support.Layout;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "error")
public class ErrorController {

    @Layout(value = Layout.NONE)
    @GetMapping
    public String error() {
        return "error/index";
    }
}
