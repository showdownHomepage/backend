package com.project.showdown.service;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class BoardService {
    @Transactional
    public String savePost() {
        return "test";
    }
}
