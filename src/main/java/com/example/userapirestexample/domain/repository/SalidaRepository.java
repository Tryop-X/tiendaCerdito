package com.example.userapirestexample.domain.repository;

import com.example.userapirestexample.domain.entity.Salida;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalidaRepository extends JpaRepository<Salida, Integer> {
}
