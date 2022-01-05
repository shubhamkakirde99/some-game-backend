package com.example.somegamebackend.repositories;

import com.example.somegamebackend.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, String> {
}
