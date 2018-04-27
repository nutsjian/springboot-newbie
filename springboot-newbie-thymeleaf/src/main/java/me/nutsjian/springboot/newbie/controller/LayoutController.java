package me.nutsjian.springboot.newbie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/layout")
public class LayoutController {

    @GetMapping(value = "/basic")
    public String basicLayout() {
        return "layout/basic";
    }

}
