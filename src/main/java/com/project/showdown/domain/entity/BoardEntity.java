package com.project.showdown.domain.entity;

import com.sun.istack.NotNull;
import lombok.Getter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Entity
public class BoardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String title;

    @NotNull
    @Enumerated(EnumType.STRING)
    private String create;

    private String contents;

    private Date date;
}
