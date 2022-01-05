package com.example.somegamebackend.services;

import com.example.somegamebackend.dtos.CreateUserDto;
import com.example.somegamebackend.dtos.UserDto;
import com.example.somegamebackend.models.UserModel;
import com.example.somegamebackend.repositories.ActiveGamesRepository;
import com.example.somegamebackend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    ActiveGamesRepository activeGamesRepository;

    @Autowired
    UserRepository userRepository;

    public UserModel createUser (CreateUserDto userDetails) {
        return userRepository.save(new UserModel(userDetails.getUserName()));
    }

    public List<UserModel> getAllUsers() {
        return userRepository.findAll();
    }
}
