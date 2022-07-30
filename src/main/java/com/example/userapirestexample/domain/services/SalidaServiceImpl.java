package com.example.userapirestexample.domain.services;

import com.example.userapirestexample.domain.entity.Salida;
import com.example.userapirestexample.domain.repository.SalidaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class SalidaServiceImpl {

    private final SalidaRepository salidaRepository;


    public Salida registrarSalida(Salida salida){
        salida.setFechaHora(LocalDateTime.now());
        return this.salidaRepository.save(salida);
    }
    public List<Salida> getAllSalidas(){
        return this.salidaRepository.findAll();
    }
}
