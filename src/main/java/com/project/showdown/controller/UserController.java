package com.project.showdown.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    public UserController() {

    }

    @PostMapping("/auth/register")
    public String register(String name, String email, String pw, String nickname) {
        return "ok";
    }
}
