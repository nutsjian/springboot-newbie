package me.nutsjian.springboot.newbie.controller;

import me.nutsjian.springboot.newbie.annotation.Layout;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping
public class IndexController {
    @Layout(value = Layout.NONE)
    @GetMapping
    public String index(Model model, Map<String, Object> map) {
//        model.addAttribute("name", "nutsjian");
        map.put("name", "jange.me");
        return "index";
    }
}
