package com.example.h2deploy.repositories;

import com.example.h2deploy.models.CountryModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CountryRepository extends JpaRepository<CountryModel, Integer> {

    public List<CountryModel> findAll();
}
