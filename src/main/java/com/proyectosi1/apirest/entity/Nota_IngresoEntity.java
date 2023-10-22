package com.proyectosi1.apirest.entity;

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
    private int id;

    private String descripvion;
    private String fecha;   //esto no deveria ser tipo fecha?
    private int cantidad_total;

}
