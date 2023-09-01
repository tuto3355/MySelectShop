package com.sparta.myselectshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController { //테스트용임시
    @GetMapping("/")
    public String home() {
        return "index";
    }
}