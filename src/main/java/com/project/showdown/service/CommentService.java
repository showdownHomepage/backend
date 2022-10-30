package com.project.showdown.service;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
@Service
public class CommentService {
    @Transactional
    public String saveComment() {
        return "comment test";
    }
}
