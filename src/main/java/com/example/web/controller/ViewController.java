package com.example.web.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
public class ViewController {

    @GetMapping("/mainPage")
    public String currentUser() {
        return "mainMenu";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping()
    public String loginPage() {
        return "login";
    }
}
