package com.project.showdown.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommentController {
    @GetMapping("/getComment")
    public String list() {
        return "test";
    }
}
