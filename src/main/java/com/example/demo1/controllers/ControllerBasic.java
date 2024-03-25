package com.example.demo1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/hello")
public class ControllerBasic {

    @GetMapping(path = "/helloword")
    public String getName() {
        return "index";
    }
}
