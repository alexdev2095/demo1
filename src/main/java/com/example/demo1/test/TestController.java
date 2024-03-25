package com.example.demo1.test;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/v1/test")
public class TestController {

    @GetMapping
    public String hello() {
        return "hello";
    }

}
