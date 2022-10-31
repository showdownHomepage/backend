package com.project.showdown.service;

import com.project.showdown.domain.entity.UserEntity;
import com.project.showdown.domain.repository.UserRepository;
import com.project.showdown.dto.UserDto;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

import java.util.*;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public String registerUser(UserDto userDto) {
        Optional<UserEntity> user = userRepository.findByEmail(userDto.getEmail());

        if (!user.isEmpty()) {
            return "이메일 중복";
        } else {
            UserEntity newUser = new UserEntity();

            newUser.setName(userDto.getName());
            newUser.setEmail(userDto.getEmail());
            newUser.setPhone(userDto.getPhone());
            newUser.setPassword(userDto.getPassword());
            newUser.setPhone(userDto.getPhone());
            newUser.setRegister_date(userDto.getRegister_date());
            newUser.setNickname(userDto.getNickname());

            return userRepository.save(newUser).getId();
        }
    }

    @Transactional
    public String loginUser(UserDto userDto) {
        Optional<UserEntity> user = userRepository.findByEmailAndPw(userDto.getEmail(), userDto.getPassword());

        if (!user.isEmpty()) {
            return user.get(); // ㅋㅋ 못해먹겠네
        } else {
            UserEntity newUser = new UserEntity();

            newUser.setName(userDto.getName());
            newUser.setEmail(userDto.getEmail());
            newUser.setPhone(userDto.getPhone());
            newUser.setPassword(userDto.getPassword());
            newUser.setPhone(userDto.getPhone());
            newUser.setRegister_date(userDto.getRegister_date());
            newUser.setNickname(userDto.getNickname());

            return userRepository.save(newUser).getId();
        }
    }
}
