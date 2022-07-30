package com.example.userapirestexample.domain.entity;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name="choferes")
@Getter
@Setter
public class Chofer {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idChofer;

    @NotNull
    @Column(name = "nombre_chofer", nullable = false, length = 50)
    private String nombreChofer;

}
