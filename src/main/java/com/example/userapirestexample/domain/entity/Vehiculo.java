package com.example.userapirestexample.domain.entity;


import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name="vehiculos")
@Getter
@Setter
public class Vehiculo {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idVehiculo;

    @NotNull
    @Column(name = "placa_carro", nullable = false, length = 10)
    private String placaCarro;

    @ManyToOne
    @JoinColumn(name = "idChofer", nullable = false, foreignKey = @ForeignKey(name = "FK_chofer"))
    private Chofer chofer;


}
