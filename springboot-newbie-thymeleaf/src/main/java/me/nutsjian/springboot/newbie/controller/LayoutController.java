package me.nutsjian.springboot.newbie.controller;

import me.nutsjian.springboot.newbie.annotation.Layout;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/layout_demo")
public class LayoutController {

    @Layout(value = "layouts/default")
    @GetMapping(value = "/basic")
    public String basicLayout() {
        return "layout_demo/basic";
    }

    @Layout(value = "layouts/simple")
    @GetMapping(value = "simple")
    public String simpleLayout() {
        return "layout_demo/simple";
    }

    @Layout(value = "layouts/include")
    @GetMapping(value = "include")
    public String includeLayout() {
        return "layout_demo/include";
    }

    @Layout(value = Layout.NONE)
    @GetMapping(value = "none")
    public String noneLayout() {
        return "layout_demo/none";
    }

    @GetMapping(value = "500")
    public String error500() {
        throw new RuntimeException("just throw exception");
    }
}
