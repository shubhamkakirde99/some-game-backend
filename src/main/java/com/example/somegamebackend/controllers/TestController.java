package com.example.somegamebackend.controllers;

import com.example.somegamebackend.dtos.CreateUserDto;
import com.example.somegamebackend.dtos.PostDto;
import com.example.somegamebackend.dtos.UserDto;
import com.example.somegamebackend.models.UserModel;
import com.example.somegamebackend.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class TestController {

    @Autowired
    GameService gameService;

    @GetMapping("/")
    public ResponseEntity<String> testWorking () {
        return ResponseEntity.ok("This endpoint is working ig");
    }

    @GetMapping("/speedTest")
    public ResponseEntity<String> checkSpeed () {
        long startTime = System.nanoTime();

        String baseString = "Some String";
        List<String> stringList = new ArrayList<>();
        for (int i=0; i< 10000; i++) {
            String newString = baseString;
            stringList.add(newString);
        }
        long duration = (System.nanoTime() - startTime);
        stringList.add("took " + duration + " nanoseconds");
        return ResponseEntity.ok(stringList.stream().collect(Collectors.joining(", ")));
    }

    @GetMapping("/get-all-users")
    public ResponseEntity<List<UserModel>> getAllUsers() {
        return ResponseEntity.ok(gameService.getAllUsers());
    }

    @PostMapping("/create-user")
    public ResponseEntity<UserDto> createUser(@RequestBody CreateUserDto userData) {
        System.out.println("User will be created for " + userData.getUserName());
        gameService.createUser(userData);
        return ResponseEntity.ok(new UserDto("asf", userData.getUserName()));
    }
}
