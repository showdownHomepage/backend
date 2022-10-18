package com.project.showdown.domain.repository;

import com.project.showdown.domain.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {

    BoardEntity insertBoard(BoardEntity boardEntity);

    List<BoardEntity> getBoardList();
}
