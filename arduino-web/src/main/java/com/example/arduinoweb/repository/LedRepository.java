package com.example.arduinoweb.repository;

import com.example.arduinoweb.model.Led;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LedRepository extends JpaRepository<Led, Integer> {
}
