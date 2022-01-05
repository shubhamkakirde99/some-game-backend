package com.example.somegamebackend.repositories;

import com.example.somegamebackend.models.CountryModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CountryRepository extends JpaRepository<CountryModel, Integer> {

    public List<CountryModel> findAll();
}
