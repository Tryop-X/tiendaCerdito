package com.example.userapirestexample.application.controller;

import com.example.userapirestexample.domain.entity.Salida;
import com.example.userapirestexample.domain.services.SalidaServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/salida")
@AllArgsConstructor
public class SalidaController {

    private SalidaServiceImpl salidaService;

    @GetMapping()
    public ResponseEntity<List<Salida>> listarSalidas(){

        List<Salida> salidas = this.salidaService.getAllSalidas();

        return new ResponseEntity<List<Salida>>(salidas, HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity<Salida> guardarSalida(@RequestBody Salida salida){

        Salida newSalida = this.salidaService.registrarSalida(salida);

        return new ResponseEntity<Salida>(newSalida, HttpStatus.OK);
    }

}
