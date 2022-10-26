package com.project.showdown.domain.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EntityListeners(AuditingEntityListener.class)
public class UserEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column()
    private String register_date;

    @Column(nullable = false)
    private String nickname;

    @Column(nullable = false, unique = true)
    private String phone;

    @Builder
    public UserEntity(Long id, String name, String email, String password, String register_date, String nickname, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.register_date = register_date;
        this.nickname = nickname;
        this.phone = phone;
    }
}
