package com.project.showdown.controller;

import com.project.showdown.domain.entity.UserEntity;
import com.project.showdown.dto.UserDto;
import com.project.showdown.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class UserController {
    private UserService userService;
    public UserController() {

    }

    @PostMapping("/auth/register")
    public String register(String name, String email, String pw, String nickname) {
        UserDto newUser = new UserDto();
        newUser.setName(name);
        newUser.setEmail(email);
        newUser.setPassword(pw);
        newUser.setNickname(nickname);

        return userService.registerUser(newUser);
    }

    @PostMapping("/auth/login")
    public String login(String email, String pw) {
        return "login";
    }

    @PostMapping("/auth/user")
    public String auth(String token) {
        return "auth";
    }

    @PostMapping("/auth/email")
    public String sendEmail(String email) {
        return "send email";
    }

    @PutMapping("/auth/password")
    public String changePw(String userId, String password) {
        return "change pw";
    }

    @DeleteMapping("/auth/user/:userId")
    public String deleteUser() {
        return "delete user";
    }

    @GetMapping("/auth/user/id")
    public String findUser(String userName) {
        return "email";
    }
}
