package com.project.showdown.domain.repository;

import com.project.showdown.domain.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public class BoardRepository extends JpaRepository<BoardEntity, Long> {
}
