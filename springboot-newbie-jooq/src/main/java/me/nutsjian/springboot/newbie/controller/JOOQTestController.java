package me.nutsjian.springboot.newbie.controller;

import me.nutsjian.springboot.newbie.condition.MetadataGetCondition;
import me.nutsjian.springboot.newbie.dto.Response;
import me.nutsjian.springboot.newbie.service.JOOQTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/mocaweb")
public class JOOQTestController {

    private final JOOQTestService jooqTestService;

    @Autowired
    public JOOQTestController(JOOQTestService jooqTestService) {
        this.jooqTestService = jooqTestService;
    }

    @RequestMapping(value = "/metadata/get")
    public Response metadataGet(@RequestBody MetadataGetCondition condition) {
        return this.jooqTestService.metadataGet(condition);
    }

}
