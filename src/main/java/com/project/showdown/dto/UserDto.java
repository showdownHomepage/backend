package com.project.showdown.dto;

import com.project.showdown.domain.entity.UserEntity;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class UserDto {
    private Long id;
    private String name;
    private String email;
    private String password;
    private String register_date;
    private String nickname;
    private String phone;

    public UserEntity toEntity() {
        UserEntity build = UserEntity.builder()
                .id(id)
                .name(name)
                .email(email)
                .password(password)
                .register_date(register_date)
                .nickname(nickname)
                .phone(phone).build();

        return build;
    }

    @Builder
    public UserDto(Long id, String name, String email, String password, String register_date, String nickname, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.register_date = register_date;
        this.nickname = nickname;
        this.phone = phone;
    }
}
