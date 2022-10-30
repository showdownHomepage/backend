package com.project.showdown.domain.repository;

import com.project.showdown.domain.entity.BoardEntity;
import com.project.showdown.domain.entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<CommentEntity, Long> {

    CommentEntity insertComment(CommentEntity commentEntity);

    List<CommentEntity> getCommentList();
}
