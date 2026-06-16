package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
    @RequestMapping("/test")
    public String hello() {

        System.out.println("call received for ramesh kumar testing api");
        return "test api string response";
    }
}
