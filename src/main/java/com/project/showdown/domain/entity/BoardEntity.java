package com.project.showdown.domain.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Entity
public class BoardEntity {
    @Id
    @GeneratedValue
    private Long id;
}
