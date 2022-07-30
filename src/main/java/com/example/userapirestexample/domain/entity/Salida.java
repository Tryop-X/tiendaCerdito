package com.example.userapirestexample.domain.entity;


import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="salidas")
@Getter
@Setter
public class Salida {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idSalida;

    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm")
    @Column(name = "fecha_hora",nullable = false)
    private LocalDateTime fechaHora;

    @NotNull
    @Column(name = "observaciones", nullable = false, length = 50)
    private String observaciones;

    @ManyToOne
    @JoinColumn(name = "idVehiculo", nullable = false, foreignKey = @ForeignKey(name = "FK_vehiculo"))
    private Vehiculo vehiculo;

}
