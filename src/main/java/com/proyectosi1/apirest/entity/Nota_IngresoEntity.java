package com.proyectosi1.apirest.entity;

import java.util.Date;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table (name = "NOTA_INGRESO")
public class Nota_IngresoEntity {
    @Id
    @GeneratedValue
    private int id;

    private String descripcion;
    private Date fecha;   
    private int cantidad_total;

}
