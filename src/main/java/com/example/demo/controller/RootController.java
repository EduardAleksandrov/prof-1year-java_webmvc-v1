package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class RootController {
    @GetMapping
    @ResponseBody  // Optional if you are returning a view
    public String home() {
        return "Welcome to the Home Page!";
    }
}
