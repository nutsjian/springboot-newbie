package me.nutsjian.springboot.newbie.controller;

import me.nutsjian.springboot.newbie.dto.Response;
import me.nutsjian.springboot.newbie.service.JOOQTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/web_client")
public class JOOQMetadataController {

    private final JOOQTestService jooqTestService;

    @Autowired
    public JOOQMetadataController(JOOQTestService jooqTestService) {
        this.jooqTestService = jooqTestService;
    }

    @RequestMapping(value = "/fetch_data.service")
    @ResponseBody
    public Response fetchData(String parames) {
        return this.jooqTestService.metadataFetch(parames);
    }


}
