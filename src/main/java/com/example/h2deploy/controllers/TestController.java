package com.example.h2deploy.controllers;

import com.example.h2deploy.models.CountryModel;
import com.example.h2deploy.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class TestController {

    @Autowired
    CountryRepository countryRepository;

    @GetMapping("/")
    public ResponseEntity<String> testWorking () {
        return ResponseEntity.ok("This endpoint is working");
    }

    @GetMapping("/getData")
    public ResponseEntity<String> getAllCountries () {
        List<CountryModel> countriesList = countryRepository.findAll();
        return ResponseEntity.ok(countriesList.stream().map(CountryModel::getName).collect(Collectors.joining(", ")));
    }

//    @GetMapping("/speedTest")
//    public ResponseEntity<String> checkSpeed () {
//        long startTime = System.nanoTime();
//
//        String baseString = "Some String";
//        List<String> stringList = new ArrayList<>();
//        for (int i=0; i< 10000; i++) {
//            String newString = baseString;
//            stringList.add(newString);
//        }
//        long duration = (System.nanoTime() - startTime);
//        stringList.add("took " + duration + " nanoseconds");
//        return ResponseEntity.ok(stringList.stream().collect(Collectors.joining(", ")));
//    }
}
