package com.example.springbootintellij.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {

    @GetMapping({"/", "/home"})
    public String home(){
        return "Welcome HOme";
    }

    @GetMapping("/test")
    public String test(){
        return "Welcome HOme";
    }

    // new commit

}
