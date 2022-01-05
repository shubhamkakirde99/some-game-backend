package com.example.somegamebackend.repositories;

import com.example.somegamebackend.models.ActiveGamesModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActiveGamesRepository extends JpaRepository<ActiveGamesModel, String> {


}
