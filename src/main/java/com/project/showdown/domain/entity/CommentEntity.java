package com.project.showdown.domain.entity;
import com.sun.istack.NotNull;
import lombok.Getter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Entity
public class CommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    //@Enumerated(EnumType.STRING)
    private String creator;

    @NotNull
    private Boolean isSecret;

    private String content;

    private Date register_date;
}
